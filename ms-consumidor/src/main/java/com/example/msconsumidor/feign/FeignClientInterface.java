package com.example.msconsumidor.feign;

import com.example.msconsumidor.config.FeignInterceptor;
import com.example.msconsumidor.config.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ms-consumido", configuration = FeignInterceptor.class)
public interface FeignClientInterface {

    @GetMapping("/consumido")
    String getConsumido();
}
