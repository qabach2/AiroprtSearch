package com.airportSearch.airportSearch.Controller;

import com.airportSearch.airportSearch.Model.Flights;
import com.airportSearch.airportSearch.Service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/Flights")
public class FlightsController {
    private final FlightsService flightsService;

    @Autowired
    public FlightsController(FlightsService flightsService) {
        this.flightsService = flightsService;
    }

    @GetMapping
    public List<Flights> getAllFlights() {
        return flightsService.getAllFlights();
    }


    @GetMapping("/{departure_city}")
   public List<Flights> getFlightByDepartureCityName(@PathVariable("departure_city") String departure_city) {
       return flightsService.getFlightByDepartureCityName(departure_city);
   }

   @GetMapping("/{departure_city}/{arrival_city}")
    public List<Flights> getFlightsByDepartureAndArrival(@PathVariable("departure_city") String departureCity, @PathVariable("arrival_city") String arrivalCity) {
        return flightsService.getFlightsByDepartureCityAndArrivalCity(departureCity, arrivalCity);
   }
}
//@GetMapping("/{name}")
//    public List <Flights> getFlightByDepartureCity(@PathVariable("name") String name){
//    return flightsService.getFlightByDepartureCity(name);
//    }
// @GetMapping("/{name}")
//    public List <Flights> getFlightByArrivalCity(@PathVariable ("name") String name){
//        return flightsService.getFlightByArrivalCity(name);
//    }

