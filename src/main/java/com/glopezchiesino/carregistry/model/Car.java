package com.glopezchiesino.carregistry.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Car extends Vehicle {
    private Integer numberOfDoors;

    private Boolean isConvertible;

    public Car(String brand, String model, Integer year, Integer numberOfDoors, Boolean isConvertible) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }
}
