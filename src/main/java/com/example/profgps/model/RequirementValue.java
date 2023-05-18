package com.example.profgps.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Table(name = "requirement_values")
@Entity
public class RequirementValue {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



}
