package com.airportSearch.airportSearch.Service;

import com.airportSearch.airportSearch.DAO.CitiesRepository;
import com.airportSearch.airportSearch.DAO.FlightsRepository;
import com.airportSearch.airportSearch.Model.Flights;
import com.airportSearch.airportSearch.repositories.CitiesRepo;
import com.airportSearch.airportSearch.repositories.FlightsRepo;

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
    CitiesRepo citiesrepo;
    FlightsRepo flightsrepo;

    public FlightsService (CitiesRepository citiesRepository, FlightsRepository flightsRepository){
        this.citiesRepository = citiesRepository;
        this.flightsRepository = flightsRepository;
    }
    public List <Flights> getAllFlights() {

        return flightsRepository.findAll();

    }
    
    public Flights findByFlightId(int flightID) {
    	Optional<Flights> optional = flightsrepo.findById(flightID);
    	
    	if(!optional.isPresent()) {
    		return null;
    	} else {
    		return optional.get();
    	}
    }
    public  List <Flights> getFlightByDepartureCity(String name){
        return  flightsRepository.getFlightByDepartureCity(name);
    }
    public  List <Flights> getFlightByDepartureCityAndArrivalCity(String name){
        return  flightsRepository. getFlightByDepartureCityAndArrivalCity(name);
    }

}
