package com.airportSearch.airportSearch.Model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Builder
@ToString
@Table(name = "Cities")
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String  name;

    public Cities(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
