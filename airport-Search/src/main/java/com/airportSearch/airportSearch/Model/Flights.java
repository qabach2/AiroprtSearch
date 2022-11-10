package com.airportSearch.airportSearch.Model;

import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@Entity
//@Builder
@ToString
@Table(name = "Flights")
public class Flights {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String departureCity; // In the database, the column name is "departure_city"
    @Column
    private String arrivalCity;
    @Column
    private int departureTime;
    @Column
    private int arrivalTime;

    @ManyToOne
    @JoinColumn(name = "departure_city_id")
    private Cities departureCityID;
    @ManyToOne
    @JoinColumn(name = "arrival_city_id")
    private Cities arrivalCityID;


    
//    @ManyToOne
//    @JoinColumn(referencedColumnName = "id")
//    @JsonIgnore
//   Cities cities;




}

