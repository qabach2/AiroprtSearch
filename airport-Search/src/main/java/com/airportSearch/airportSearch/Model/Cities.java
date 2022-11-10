package com.airportSearch.airportSearch.Model;

import lombok.*;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
//@Builder
@ToString
@Table(name = "Cities")
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String  cityName;

    //@OneToMany(mappedBy = "Cities", cascade = CascadeType.ALL)
    //private List<Flights> flights;
  //Cities cities;
}
