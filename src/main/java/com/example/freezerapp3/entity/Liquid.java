package com.example.freezerapp3.entity;

import java.time.LocalDate;


public class Liquid extends Food {

    public Liquid(String name, double weight, Unit unitOfMeasure, LocalDate dateOfStorage) {
        super(name, weight, unitOfMeasure, dateOfStorage);
    }
}
