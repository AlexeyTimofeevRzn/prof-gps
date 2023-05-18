package com.example.profgps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "requirement_id", nullable = false, foreignKey = @ForeignKey(name = "FK_REQUIREMENT"))
    private Requirement requirement;

    @ManyToMany
    @JoinTable(name = "form_requirement_values", joinColumns = @JoinColumn(name = "requirement_value_id"),
    foreignKey = @ForeignKey(name = "FK_REQUIREMENT_VALUE_FORMS"),
    inverseJoinColumns = @JoinColumn(name = "form_id"), inverseForeignKey = @ForeignKey(name = "FK_FORM_REQUIREMENT_VALUES"))
    private List<Form> forms;
}
