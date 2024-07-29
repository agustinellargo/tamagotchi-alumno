package com.example.agustin.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Alumno2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String ciudad;
    private int edad;
    private int curso;
}
