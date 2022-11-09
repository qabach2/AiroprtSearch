package com.airportSearch.airportSearch.Model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Builder
@ToString
@Table(name = "Flights")
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String departure_City;
    @Column
    private String arrival_city;
    @Column
    private int departure_time;
    @Column
    private int arrival_time;

    public Flights(int id, String departure_City, String arrival_city, int departure_time, int arrival_time) {
        this.id = id;
        this.departure_City = departure_City;
        this.arrival_city = arrival_city;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture_City() {
        return departure_City;
    }

    public void setDeparture_City(String departure_City) {
        this.departure_City = departure_City;
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public int getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(int departure_time) {
        this.departure_time = departure_time;
    }

    public int getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(int arrival_time) {
        this.arrival_time = arrival_time;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", departure_City='" + departure_City + '\'' +
                ", arrival_city='" + arrival_city + '\'' +
                ", departure_time=" + departure_time +
                ", arrival_time=" + arrival_time +
                '}';
    }
}

