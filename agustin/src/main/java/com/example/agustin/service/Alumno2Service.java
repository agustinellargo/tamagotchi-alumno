package com.example.agustin.service;

import com.example.agustin.models.Alumno2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Alumno2Service {
    private Alumno2 alumno2;;

    @Autowired
    public Alumno2Service(Alumno2 alumno2){
        this.alumno2 = alumno2;
    }
    public Alumno2 getAlumno2(){
        return alumno2;
    }


}
