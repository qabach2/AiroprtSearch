package com.airportSearch.airportSearch.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airportSearch.airportSearch.Model.Cities;

@Repository
public interface CitiesRepository extends JpaRepository<Cities, Integer>{
	Optional<Cities> findByCity(int CityNumber);
	
	Cities findByName(String CityName);
}
