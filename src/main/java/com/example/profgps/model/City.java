package com.example.profgps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cities")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;
}
