package com.glopezchiesino.carregistry.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehicle {
    private String brand;
    
    private String model;
    
    private Integer year;
}

