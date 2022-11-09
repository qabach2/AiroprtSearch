package com.airportSearch.airportSearch.Service;

import com.airportSearch.airportSearch.DAO.CitiesRepository;
import com.airportSearch.airportSearch.DAO.FlightsRepository;
import com.airportSearch.airportSearch.Model.Cities;
import com.airportSearch.airportSearch.Model.Flights;
import com.airportSearch.airportSearch.repositories.CitiesRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesService {
	private final CitiesRepo CR;
	
	public CitiesService(CitiesRepo CR) {
		this.CR = CR;
	}
	
	public List<Flights> getAllFlights(int cityID){
		return this.findById(cityID).getFlights();
	}
	
	@SuppressWarnings("deprecation")
	public Cities findById(int id) {
		return CR.getById(id);
	}
}
