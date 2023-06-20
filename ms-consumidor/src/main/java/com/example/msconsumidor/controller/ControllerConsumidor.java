package com.example.msconsumidor.controller;

import com.example.msconsumidor.service.ServiceConsumidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumidor")
public class ControllerConsumidor {

    private final ServiceConsumidor serviceConsumidor;

    public ControllerConsumidor(ServiceConsumidor serviceConsumidor) {
        this.serviceConsumidor = serviceConsumidor;
    }

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public String getConsumidor() {
        return serviceConsumidor.getConsumido();
    }

}
