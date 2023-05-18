package com.example.profgps.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Columns;

import java.sql.Date;
import java.util.List;

@Table(name = "vacancies")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vacancy {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "country", nullable = false,
            foreignKey = @ForeignKey(name = "FK_COUNTRY"))
    private Country country;

    @ManyToOne
    @JoinColumn(name = "city", nullable = false,
            foreignKey = @ForeignKey(name = "FK_CITY"))
    private City city;

    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "publish_date", nullable = false)
    private Date publishDate;

    @ManyToOne
    @JoinColumn(name = "direction", nullable = false)
    private Direction direction;

    @ManyToMany
    @JoinTable(name = "vacancy_requirements", joinColumns =
    @JoinColumn(name = "vacancy_id"), foreignKey = @ForeignKey(name = "FK_VACANCIES_REQUIREMENT"),
            inverseJoinColumns = @JoinColumn(name = "requirement_id"),
            inverseForeignKey = @ForeignKey(name = "FK_REQUIREMENTS_VACANCY"))
    private List<Requirement> requirements;

}
