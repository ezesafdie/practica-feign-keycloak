package com.example.msconsumidor.repository;

import com.example.msconsumidor.feign.FeignClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryConsumidorImpl implements RepositoryConsumidor {
    private final FeignClientInterface feignClientInterface;

    public RepositoryConsumidorImpl(FeignClientInterface feignSubscriptionRepository) {
        this.feignClientInterface = feignSubscriptionRepository;
    }

    @Override
    public String getConsumido() {
        return feignClientInterface.getConsumido();
    }
}
