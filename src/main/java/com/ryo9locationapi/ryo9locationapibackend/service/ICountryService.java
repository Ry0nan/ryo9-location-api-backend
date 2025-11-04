package com.ryo9locationapi.ryo9locationapibackend.service;

import com.ryo9locationapi.ryo9locationapibackend.model.Country;
import java.util.List;

public interface ICountryService {

    List<Country> getCountries();

    Country addCountry(Country country);

    Country updateCountry(long id, Country countryDetails);

    Country getCountry(long id);

    void deleteCountry(long id);
}