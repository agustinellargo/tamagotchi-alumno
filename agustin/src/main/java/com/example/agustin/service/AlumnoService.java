package com.example.agustin.service;

import com.example.agustin.models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {
    private Alumno alumno;
    List<Alumno> listado = new ArrayList<>();

    @Autowired
    public AlumnoService(Alumno alumno){
        this.alumno= alumno;
    }


    public Alumno getAlumno(){

        return alumno;
    }
    public Alumno usuarioRandom(String nombre){
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setCiudad("trebujena");
        alumno.setEdad(28);
        alumno.setCurso(6);
        listado.add(alumno);
        return alumno;
    }
    public Alumno crearUsuario(String nombre,int edad,int curso,String ciudad){
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setEdad(edad);
        alumno.setCurso(curso);
        alumno.setCiudad(ciudad);
        listado.add(alumno);
        return alumno;
    }
    public List<Alumno> listaAlumnos(){
        return listado;
    }
}
