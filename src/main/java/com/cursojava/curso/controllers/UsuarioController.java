package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

/*TODO esto es para poder manejar el tema de las rutas*/
    @RequestMapping(value= "prueba")
    public List<String> prueba(){
        return List.of("Manzana","Peras","Uvas");
    }
}
