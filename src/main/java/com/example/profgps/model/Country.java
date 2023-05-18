package com.example.profgps.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countries")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "coords", nullable = false)
    private String coords;
}
