package com.metodos.metodoshttp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/personas")
public class PersonaController {
    
    @GetMapping
    public String saludar() {
        return "Hola esta es la API!!!";
    }
    

}
