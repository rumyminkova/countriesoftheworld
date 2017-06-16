package com.teamtreehouse.countriesoftheworld.model;

import java.util.List;

/**
 * Created by Rumy on 5/29/2017.
 */
public class Country {
    private String name;
    private int population;
    private String capital;
    private List<Integer> languageId;
    private String flag;


    public Country(String name, int population, String capital, List<Integer> languageId, String flag) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.languageId = languageId;
        this.flag = flag;
    }

    public List<Integer> getLanguageId() {
        return languageId;
    }

    public void setLanguageId(List<Integer> languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (getPopulation() != country.getPopulation()) return false;
        return getName().equals(country.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPopulation();
        return result;
    }
}
