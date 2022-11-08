package com.airportSearch.airportSearch.Model;

import javax.persistence.Entity;

@Entity
public class Cities {
    private  Integer Id;
    private String  Name;

    public Cities(Integer id, String name) {
        Id = id;
        Name = name;
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
}
