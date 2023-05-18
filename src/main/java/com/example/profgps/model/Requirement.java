package com.example.profgps.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

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

//    prviate
}
