package com.example.agustin.controllers;

import com.example.agustin.models.Tamagotchi;
import com.example.agustin.service.TamagotchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiPrimerController {
    TamagotchiService tamagotchiService;

    @Autowired
    public MiPrimerController(TamagotchiService tamagotchiService){
        this.tamagotchiService = tamagotchiService;

    }

    @GetMapping("/mensaje")
    public String pruebaMensaje(){
        return "Este es el principio de mi nueva vida";
    }

    @GetMapping("/tama")
    public Tamagotchi agustin(){
       return tamagotchiService.getMessage();
    }
}
