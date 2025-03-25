package com.name.carregistry.repository.impl;

import org.springframework.stereotype.Repository;

import com.name.carregistry.model.Car;
import com.name.carregistry.repository.CarRegistryRepository;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class CarRegistryRepositoryImpl implements CarRegistryRepository {

    private Car car;

    @Override
    public void insertCar() {
        car = new Car("Ford", "Focus", 2010, 5, false);

        log.info("Car brand: " + car.getBrand() + "\nCar model: " + car.getModel() + "\nCar year: " + car.getYear() );
    }

}
