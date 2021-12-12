package com.uycoder.demo.services;
/**
 * Project:     Springboot-Pavan
 * Package:     com.uycoder.demo.beans
 * Created:     2021-11-15  22:31
 * Author:      Ahmed Bughra
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
import com.uycoder.demo.beans.Country;
import com.uycoder.demo.controllers.AddResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Part 4- Rest API & Microservices| How To Create Rest API & Microservice using SpringBoot #HashMap
// https://www.youtube.com/watch?v=gEm-Ory5NQw&list=PLUDwpEzHYYLtg-RO06RVFsauoAv241TNE&index=5

@Component
public class CountryService {
    static HashMap<Integer, Country> countryIdMap;

    public CountryService() {
        countryIdMap = new HashMap<Integer, Country>();

        Country EastTurkistanCountry = new Country(1, "EastTurkistan", "Kashghar");
        Country TurkiyeCountry = new Country(2, "Turkey", "Ankara");
        Country UsaCountry = new Country(3, "USA", "Washington");



        countryIdMap.put(1, EastTurkistanCountry);
        countryIdMap.put(2, TurkiyeCountry);
        countryIdMap.put(3, UsaCountry);
    }

    // 1. get all countries data as List from Hashmap
    // http://localhost:8081/getcountries
    public List getAllCountries() {
        List countries = new ArrayList(countryIdMap.values());
        return countries;
    }
    // for the video 6 we need to change this method like this:
    // public List<Country> getAllCountries(){
    //  return countryrep.findAll();
    //  }
    // all the methods are changed in video 6, but I didn't change it.


    // 2. get country by its ID
    // http://localhost:8081/getcountries/1
    public Country getCourtyById(int id) {
        Country country = countryIdMap.get(id);
        return country;
    }


    // 3. get country by its name and if Country name is the same as name we entered, it will return all the country datas
    // http://localhost:8081/countryname?name=india
    public Country getCountryByName(String countryName) {
        Country country = null;
        for (int i : countryIdMap.keySet()) {
            if (countryIdMap.get(i).getCountryName().equals(countryName))
                country = countryIdMap.get(i);
        }
        return country;
    }


    // 4. add new country
    // http://localhost:8081/addcountry
    public Country addCountry(Country country) {
        country.setId(getMaxId());
        countryIdMap.put(country.getId(), country);
        return country;
    }

    // Utility method to get max id
    public static int getMaxId() {
        int max = 0;
        for (int id : countryIdMap.keySet())
            if (max <= id)
                max = id;
        return max + 1;
    }


    // 5. update existing country
    // http://localhost:8081/updatecountry
    public Country updateCountry(Country country) {
        if (country.getId() > 0)
            countryIdMap.put(country.getId(), country);
        return country;
    }


    // 6. delete country data
    // http://localhost:8081/deletecountry/4
    public AddResponse deleteCountry(int id) {
        countryIdMap.remove(id);
        AddResponse res = new AddResponse();
        res.setMsg("Country deleted.");
        res.setId(id);
        return res;
    }
}
