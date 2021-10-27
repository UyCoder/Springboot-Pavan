package com.uycoder.demo.services;

import com.uycoder.demo.beans.Country;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Part 4- Rest API & Microservices| How To Create Rest API & Microservice using SpringBoot #HashMap
// https://www.youtube.com/watch?v=gEm-Ory5NQw&list=PLUDwpEzHYYLtg-RO06RVFsauoAv241TNE&index=5

public class CountryService {
    static HashMap<Integer, Country> countryIdMap;

    public CountryService() {
        countryIdMap = new HashMap<Integer, Country>();

        Country indiaCountry = new Country(1, "India", "Delhi");
        Country usaCountry = new Country(2, "USA", "Washigton");
        Country ETCountry = new Country(3, "EastTurkistan", "Kashghar");

        countryIdMap.put(1, indiaCountry);
        countryIdMap.put(2, usaCountry);
        countryIdMap.put(3, ETCountry);
    }

    // get all countries data as List from Hashmap
    public List getAllCountries() {
        List countries = new ArrayList(countryIdMap.values());
        return countries;
    }

    // get country by its ID
    public Country getCourtyById(int id) {
        Country country = countryIdMap.get(id);
        return country;
    }


    // get country by its name and if Country name is the same as name we entered
    // it will return all the country datas

    public Country getCountryByName(String countryName) {
        Country country = null;
        for (int i : countryIdMap.keySet()) {
            if (countryIdMap.get(i).getCountryName().equals(countryName))
                country = countryIdMap.get(i);
        }
        return country;
    }
}
