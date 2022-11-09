package com.airportSearch.airportSearch.Service;


import com.airportSearch.airportSearch.Model.Flights;
import com.airportSearch.airportSearch.Repositories.CitiesRepository;
import com.airportSearch.airportSearch.Repositories.FlightsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component

public class FlightsService {
    @Autowired
    CitiesRepository citiesRepository;
    FlightsRepository flightsRepository;

    @Autowired
    CitiesRepository citiesrepo;
    FlightsRepository flightsrepo;

    public FlightsService (CitiesRepository citiesRepository, FlightsRepository flightsRepository){
        this.citiesRepository = citiesRepository;
        this.flightsRepository = flightsRepository;
    }
    public List <Flights> getAllFlights() {

        return flightsRepository.findAll();

    }

    public Flights findByFlightId(int flightID) {
    	Optional<Flights> optional = flightsRepository.findById(flightID);

    	if(!optional.isPresent()) {
    		return null;
    	} else {
    		return optional.get();
    	}
    }


}
