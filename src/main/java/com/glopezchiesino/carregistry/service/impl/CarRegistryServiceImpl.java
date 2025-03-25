package com.glopezchiesino.carregistry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.glopezchiesino.carregistry.repository.CarRegistryRepository;
import com.glopezchiesino.carregistry.service.CarRegistryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CarRegistryServiceImpl implements CarRegistryService {

    @Autowired
    private CarRegistryRepository carRegistryRepository;

    @Value("${property.environment}")
    public String environment;

    @Override
    public void getProperty() {
        log.info("Property value is: {}", environment);

        carRegistryRepository.insertCar();
    }

}
