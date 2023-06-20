package com.example.msconsumidor.service;


import com.example.msconsumidor.repository.RepositoryConsumidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceConsumidor {

    @Autowired
    private RepositoryConsumidor repositoryConsumidor;

    public String getConsumido() {
        return repositoryConsumidor.getConsumido();
    }
}
