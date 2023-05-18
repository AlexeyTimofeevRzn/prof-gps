package com.example.profgps.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.util.List;

@Entity
@Table(name = "requirements")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Requirement {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(name = "vacancy_requirements", joinColumns =
    @JoinColumn(name = "requirement_id"), foreignKey = @ForeignKey(name = "FK_REQUIREMENTS_VACANCY"),
            inverseJoinColumns = @JoinColumn(name = "vacancy_id"),
            inverseForeignKey = @ForeignKey(name = "FK_VACANCY_REQUIREMENTS"))
    private List<Vacancy> vacancies;

}
