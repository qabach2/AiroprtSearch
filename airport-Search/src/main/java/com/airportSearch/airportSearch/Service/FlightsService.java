package com.airportSearch.airportSearch.Service;

import com.airportSearch.airportSearch.DAO.CitiesRepository;
import com.airportSearch.airportSearch.DAO.FlightsRepository;
import com.airportSearch.airportSearch.Model.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class FlightsService {
    @Autowired
    CitiesRepository citiesRepository;
    FlightsRepository flightsRepository;

    public FlightsService (CitiesRepository citiesRepository, FlightsRepository flightsRepository){
        this.citiesRepository = citiesRepository;
        this.flightsRepository = flightsRepository;
    }
    public  List <Flights> getAllFlights() {

        return flightsRepository.findAll();

    }
    public  List <Flights> getFlightByDepartureCity(String name){
        return  flightsRepository.getFlightByDepartureCity(name);
    }
    public  List <Flights> getFlightByDepartureCityAndArrivalCity(String name){
        return  flightsRepository. getFlightByDepartureCityAndArrivalCity(name);
    }

}
