package com.example.agustin.service;

import com.example.agustin.models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    private Alumno alumno;


    @Autowired
    public AlumnoService(Alumno alumno){
        this.alumno= alumno;
    }


    public Alumno getAlumno(){
        return alumno;
    }

}
