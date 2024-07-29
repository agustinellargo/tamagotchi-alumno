package com.example.agustin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Tamagotchi implements Serializable {

    private static final long serialVersionUID = 1L;
    String nombre;
    private int edad;
    private int hambre ;
    private int felicidad;
    private int salud;
}

