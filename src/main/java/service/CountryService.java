package com.ryo9locationapi.ryo9locationapibackend.service;

import com.ryo9locationapi.ryo9locationapibackend.model.Country;
import com.ryo9locationapi.ryo9locationapibackend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> getCountries() {
        return (List<Country>) repository.findAll();
    }

    @Override
    public Country getCountry(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public Country updateCountry(long id, Country countryDetails) {

        Optional<Country> optionalCountry = repository.findById(id);

        if (optionalCountry.isPresent()) {
            Country existingCountry = optionalCountry.get();
            existingCountry.setName(countryDetails.getName());
            existingCountry.setLanguage(countryDetails.getLanguage());
            return repository.save(existingCountry);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCountry(long id) {
        repository.deleteById(id);
    }
}