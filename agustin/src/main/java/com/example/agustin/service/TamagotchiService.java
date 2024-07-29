package com.example.agustin.service;

import com.example.agustin.models.Tamagotchi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TamagotchiService {

    Tamagotchi agustin;

    @Autowired
    public TamagotchiService(Tamagotchi tamagotchi){
        this.agustin = tamagotchi;
    }

    public Tamagotchi getMessage(){
        return agustin;
    }
}
