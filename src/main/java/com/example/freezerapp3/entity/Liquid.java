package com.example.freezerapp3.entity;

import java.sql.Timestamp;


public class Liquid extends Food {

    public Liquid(String name, double weight, Unit unitOfMeasure, Timestamp dateOfStorage) {
        super(name, weight, unitOfMeasure, dateOfStorage);
    }
}
