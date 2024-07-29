package com.example.agustin.configs;

import com.example.agustin.models.Alumno;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlumnoConfig {

    @Bean
    public Alumno getAlumno(){
        Alumno alumno = new Alumno();
        alumno.setCiudad("chiclana");
        alumno.setEdad(18);
        alumno.setCurso(4);
        alumno.setNombre("manuel");
        return alumno;
    }

}
