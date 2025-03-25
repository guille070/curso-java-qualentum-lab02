package com.name.carregistry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.name.carregistry.model.Car;
import com.name.carregistry.service.CarRegistryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CarRegistryController {

    @Autowired
    private CarRegistryService carRegistryService;

    @GetMapping("/cars")
    public void getCarData() {
        this.addCar();

        log.info("Se ha accedido a la aplicación");

        carRegistryService.getProperty();
    }

    public Car addCar(){
        Car car = new Car("Renault", "Megane", 2010, 5, false);

        return car;
    }

}
