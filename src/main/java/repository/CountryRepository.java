package com.ryo9locationapi.ryo9locationapibackend.repository;

import com.ryo9locationapi.ryo9locationapibackend.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}