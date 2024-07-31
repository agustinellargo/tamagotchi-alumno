package com.example.agustin.controllers;

import com.example.agustin.models.Alumno;
import com.example.agustin.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/crearUsuario/")
    public Alumno crearUsuario(@RequestParam String nombre,
                               @RequestParam int edad,
                               @RequestParam int curso,
                               @RequestParam String ciudad) {


        return alumnoService.crearUsuario(nombre,edad,curso,ciudad);
    }
    @GetMapping("/usuarioRandom/{nombre}")
    public Alumno usuarioRandom(@PathVariable String nombre){
        return alumnoService.usuarioRandom(nombre);
    }
    @GetMapping("/listado/")
    public List<Alumno> getlistado(){
        return alumnoService.listaAlumnos();
    }
}
