package com.example.msconsumidor.repository;

import com.example.msconsumidor.config.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;


public interface RepositoryConsumidor {

    String getConsumido();
}
