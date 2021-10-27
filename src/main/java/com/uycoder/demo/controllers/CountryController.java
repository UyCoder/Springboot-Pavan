package com.uycoder.demo.controllers;

import com.uycoder.demo.beans.Country;
import com.uycoder.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Part 5- Rest API & Microservices| How To Create Rest API & Microservice using SpringBoot
// https://www.youtube.com/watch?v=wWnVPPKbqKY&list=PLUDwpEzHYYLtg-RO06RVFsauoAv241TNE&index=5

@RestController
public class CountryController {

    // dependency injection
    @Autowired
    CountryService countryService;


    @GetMapping("/getcountries")
    public List getcountries() {
        return countryService.getAllCountries();
    }


    @GetMapping("/getcountries/{id}")
    public Country getCourtyById(@PathVariable(value = "id") int id) {
        return countryService.getCourtyById(id);
    }

    @GetMapping("/getcountries/countryname")
    public Country getCountryByName(@RequestParam(value = "name") String countryName) {
        return countryService.getCountryByName(countryName);
    }

    @PutMapping("/addcountry")
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }


    @PutMapping("/updatcountry")
    public Country updateCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);
    }


    @DeleteMapping("/deletecountry/{id}")
    public AddResponse deleteCountry(@PathVariable(value = "id") int id) {
        return countryService.deleteCountry(id);
    }
}
