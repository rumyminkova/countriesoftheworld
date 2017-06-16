package com.teamtreehouse.countriesoftheworld.data;

import com.teamtreehouse.countriesoftheworld.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * Created by Rumy on 5/29/2017.
 */
@Component
public class CountryRepository {
       private static final List<Country> ALL_COUNTRIES= Arrays.asList(
               new Country("Russia", 143_364_677, "Moscow",  Arrays.asList(4), "russia"),
               // new Country("France", 64_928_089, "Paris", Arrays.asList(2), "france"),
               new Country("Canada", 36_604_138, "Ottawa", Arrays.asList(1,2), "canada"),
               new Country("Belgium", 11_443_830, "Brussels", Arrays.asList(2,3,5), "belgium"),
               new Country("Cuba", 11_390_184, "Havana", Arrays.asList(6), "cuba"),
               new Country("Spain", 46_070_146, "Madrid", Arrays.asList(6), "spain")

      );

       public List<Country> getAllCountries(){
            return ALL_COUNTRIES;
        }



    public List<Country> sortByPopulation(){
        List<Country> countries=ALL_COUNTRIES;
        countries.sort(new Comparator<Country>(){
            @Override
            public int compare(Country c1,Country c2){
                if(c1.equals(c2)){
                    return 0;
                }
                return c1.getPopulation()-c2.getPopulation();

            }
        }  );

        return countries;

    }


   public List<Country> sortByName() {
        List<Country> countries = ALL_COUNTRIES;
        countries.sort(new Comparator<Country>() {
            @Override
            public int compare(Country c1,Country c2){
                if(c1.equals(c2)){
                    return 0;
                }
                return c1.getName().compareTo(c2.getName());
            }
        });

        return countries;
    }

    public static Country getCountryByName(String name){
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getName().equals(name))
                .findFirst()
                .orElse(null);
   }


}
