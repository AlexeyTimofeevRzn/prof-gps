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
    @JoinColumn(name = "city", nullable = true)
    private City city;

    @ManyToOne
    @JoinColumn(name = "direction", nullable = false)
    private Direction direction;

    @ManyToMany
    @JoinTable(name = "form_requirement_values", joinColumns = @JoinColumn(name = "form_id"),
            foreignKey = @ForeignKey(name = "FK_FORM_REQUIREMENT_VALUES"),
            inverseJoinColumns = @JoinColumn(name = "requirement_value_id"), inverseForeignKey = @ForeignKey(name = "FK_REQUIREMENT_VALUE_FORMS"))
    private List<RequirementValue> requirementValue;
}
