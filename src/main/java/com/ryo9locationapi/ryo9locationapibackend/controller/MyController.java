package com.ryo9locationapi.ryo9locationapibackend.controller;

import com.ryo9locationapi.ryo9locationapibackend.model.Country;
import com.ryo9locationapi.ryo9locationapibackend.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private ICountryService countryService;

    @PostMapping("/countries")
    public Country addCountrySubmit(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @GetMapping("/countries")
    public List<Country> findCountries() {
        return countryService.getCountries();
    }

    @GetMapping("/show-country/{id}")
    public Country showCountry(@PathVariable long id) {
        return countryService.getCountry(id);
    }

    @PutMapping("/update-country/{id}")
    public Country updateCountry(@PathVariable long id, @RequestBody Country countryDetails) {
        return countryService.updateCountry(id, countryDetails);
    }

    @DeleteMapping("/delete-country/{id}")
    public void deleteCountry(@PathVariable long id) {
        countryService.deleteCountry(id);
    }
}