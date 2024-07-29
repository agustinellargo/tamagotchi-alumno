package com.example.agustin.configs;

import com.example.agustin.models.Tamagotchi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TamagotchiConfig {

    @Bean
    public Tamagotchi getTamagotchi(){
        Tamagotchi agustin = new Tamagotchi();
        agustin.setEdad(0);
        agustin.setFelicidad(10);
        agustin.setHambre(10);
        agustin.setNombre("david");
        agustin.setSalud(10);
        return agustin;
    }
}
