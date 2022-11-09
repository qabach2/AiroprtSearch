package com.airportSearch.airportSearch.DAO;

import com.airportSearch.airportSearch.Model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightsRepository extends JpaRepository<Flights,Integer> {

    

    List<Flights> getFlightByDepartureCity(String name);

    List<Flights> getFlightByDepartureCityAndArrivalCity(String name);
}
