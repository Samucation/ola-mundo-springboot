package com.curso.tecnologia.controller;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/configuration")
public class OlaMundoController {

        @GetMapping
        public void callEndPoint() {
            System.out.println("Chamou o metodo GET.");
        }

        @PostMapping("/save")
        public void save() {
            System.out.println("Chamou o metodo POST.");
        }

}
