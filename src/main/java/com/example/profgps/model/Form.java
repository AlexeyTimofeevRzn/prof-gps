package com.example.profgps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "forms")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Form {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "country", nullable = false, foreignKey = @ForeignKey(name = "FK_COUNTRY"))
    private Country country;

    @ManyToOne
    @Column(name = "city", nullable = true)
    private City city;

    @ManyToOne
    @Column(name = "direction", nullable = false)
    private Direction direction;


    @OneToMany(mappedBy = "requirement_values")
    private List<RequirementValue> requirementValue;
}
