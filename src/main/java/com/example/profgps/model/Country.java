package com.example.profgps.model;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "country", nullable = false, foreignKey = @ForeignKey(name = "FK_COUNTRY"))
    private Country country;
}
