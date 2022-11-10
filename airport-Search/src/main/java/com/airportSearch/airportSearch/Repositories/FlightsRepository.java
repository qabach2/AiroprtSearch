package com.airportSearch.airportSearch.Repositories;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.airportSearch.airportSearch.Model.Cities;
import com.airportSearch.airportSearch.Model.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Integer>{

    Optional<List<Flights>> findByDepartureCity(String departure_city);

    Optional<List<Flights>> findByDepartureCityAndArrivalCity(String departure_city, String arrival_city);

    @Query(value = "SELECT * FROM Flights INNER JOIN Cities ON Flights.departure_city = Cities.city_name WHERE Flights.departure_city = :departure_city", nativeQuery = true)
    List<Flights> getFlightsByDepartureCity(@Param("departure_city") String departureCity);

    //	Optional<Flights> findByFlight(int FlightNumber);
//
//	Optional<Flights> findByCity(Cities city);
}
