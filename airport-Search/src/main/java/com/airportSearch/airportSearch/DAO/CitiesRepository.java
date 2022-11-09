package com.airportSearch.airportSearch.DAO;

import com.airportSearch.airportSearch.Model.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<Cities, Integer> {
}
