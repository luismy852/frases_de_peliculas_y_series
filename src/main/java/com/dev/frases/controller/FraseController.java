package com.dev.frases.controller;

import com.dev.frases.dto.FraseDTO;
import com.dev.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    FraseService fraseService;
    @Autowired
    public FraseController(FraseService fraseService) {
        this.fraseService = fraseService;
    }
    @GetMapping("/series/frases")
    public FraseDTO frase (){
        return fraseService.frase();
    }

}
