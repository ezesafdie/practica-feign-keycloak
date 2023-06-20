package com.example.consumido.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumido")
public class ControllerConsumidor {

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public String getConsumido() {
        return "Microservicio Consumido";
    }
}
