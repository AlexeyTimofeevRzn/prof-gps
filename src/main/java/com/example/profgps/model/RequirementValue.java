package com.example.profgps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "requirement_values")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequirementValue {

    @Id
    @Column(name = "value", nullable = false)
    private String value;

    @Column(name = "description", nullable = false)
    private String description;

    @Id
    @ManyToOne
    @JoinColumn(name = "requirement_id", nullable = false, foreignKey = @ForeignKey(name = "FK_REQUIREMENT"))
    private Requirement requirement;

}
