package com.example.agustin.controllers;

import com.example.agustin.models.Alumno2;
import com.example.agustin.service.Alumno2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno2Controller {
    Alumno2Service alumno2Service;

    @Autowired
    public Alumno2Controller(Alumno2Service alumno2Service) {
        this.alumno2Service = alumno2Service;
    }

    @GetMapping("/alumno2")
    public Alumno2 alumno2() {
        return this.alumno2Service.getAlumno2();
    }
}
