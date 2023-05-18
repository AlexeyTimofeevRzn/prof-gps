package com.example.profgps.controller;

import com.example.profgps.model.Form;
import com.example.profgps.repository.FormRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/form")
public class FormController {

    private final FormRepository repository;


    public FormController(FormRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Form> saveForm(@RequestBody Form form) {
        repository.save(form);
        return ResponseEntity.ok(form);

    }

}
