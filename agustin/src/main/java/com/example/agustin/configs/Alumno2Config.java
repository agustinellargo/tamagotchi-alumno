package com.example.agustin.configs;

import com.example.agustin.models.Alumno2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Alumno2Config {

    @Bean
    public Alumno2 getAlumno2(){
        Alumno2 alumno2 = new Alumno2();
        alumno2.setCiudad("Jerez");
        alumno2.setEdad(33);
        alumno2.setCurso(2);
        alumno2.setNombre("David");
        return alumno2;
    }
}
