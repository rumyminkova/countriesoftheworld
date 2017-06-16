package com.teamtreehouse.countriesoftheworld.controller;

import com.teamtreehouse.countriesoftheworld.data.CountryRepository;
import com.teamtreehouse.countriesoftheworld.data.LanguageRepository;
import com.teamtreehouse.countriesoftheworld.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rumy on 5/30/2017.
 */
@Controller
public class CountriesController {
   @Autowired
   private CountryRepository  countryRepository;

   @Autowired
   private LanguageRepository languageRepository;



    @RequestMapping(value = "/")
    public String listCountries( ModelMap modelMap){
        List<Country> allCountries = countryRepository.getAllCountries();
        modelMap.put("countries",allCountries);
        return "index";
    }

    @RequestMapping(value = "/sort/{byfield}")
    public String listCountries(@PathVariable String byfield, ModelMap modelMap){
        List<Country> allCountries;
        if (byfield.equals("name")){
            allCountries= countryRepository.sortByName();
        }else {
            allCountries= countryRepository.sortByPopulation();
        }
        modelMap.put("countries",allCountries);
        return "index";
    }



    @RequestMapping("/country/{name}")
    public String countryDetails(@PathVariable String name, ModelMap modelMap){

        Country country= countryRepository.getCountryByName(name);
        modelMap.put("country",country);

        List<String> languages=new ArrayList<>();
        for(int languageId:country.getLanguageId()){
            languages.add(languageRepository.findById(languageId));
        }
        modelMap.put("languages",languages);
        return "country-details";

    }

}




