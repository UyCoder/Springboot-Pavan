package com.uycoder.demo.controllers;
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
import com.uycoder.demo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Country> getCourtyById(@PathVariable(value = "id") int id) {
//        return countryService.getCourtyById(id);
        try {
            Country country = countryService.getCourtyById(id);
            return new ResponseEntity<Country>(country, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
        }
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
