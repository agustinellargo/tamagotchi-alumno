package com.example.agustin.controllers;

import com.example.agustin.models.Alumno;
import com.example.agustin.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
    AlumnoService alumnoService;

    @Autowired
    public AlumnoController(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }

    @GetMapping("/alumno")
    public Alumno alumno(){
        return this.alumnoService.getAlumno();

    }
    @GetMapping("/crearUsuario")
    public Alumno crearUsuario(){
        return this.tamagotchiService.crearTamagotchi();
    }

}
