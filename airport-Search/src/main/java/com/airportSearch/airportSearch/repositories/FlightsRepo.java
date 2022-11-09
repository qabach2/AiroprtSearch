package com.airportSearch.airportSearch.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airportSearch.airportSearch.Model.Cities;
import com.airportSearch.airportSearch.Model.Flights;

@Repository
public interface FlightsRepo extends JpaRepository<Flights, Integer>{
	Optional<Flights> findByFlight(int FlightNumber);
	
	Optional<Flights> findByCity(Cities city);
}