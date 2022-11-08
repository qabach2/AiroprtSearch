package com.airportSearch.airportSearch.Model;

import javax.persistence.Entity;

@Entity
public class Flights {
    private Integer Id;
    private String Name;
    private String Type;

    public Flights(Integer id, String name, String type) {
        Id = id;
        Name = name;
        Type = type;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}