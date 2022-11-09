package com.airportSearch.airportSearch.Controller;

import com.airportSearch.airportSearch.Model.Flights;
import com.airportSearch.airportSearch.Service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Flights")
public class FlightsController {
private  final FlightsService flightsService;
@Autowired
public  FlightsController(FlightsService flightsService){
    this.flightsService = flightsService;
}
@GetMapping
public  List <Flights> getAllFlights(){
    return flightsService.getAllFlights();
}
//@GetMapping("/{name}")
//    public List <Flights> getFlightByDepartureCity(@PathVariable("name") String name){
//    return flightsService.getFlightByDepartureCity(name);
//    }
// @GetMapping("/{name}")
//    public List <Flights> getFlightByArrivalCity(@PathVariable ("name") String name){
//        return flightsService.getFlightByArrivalCity(name);
//    }
}
