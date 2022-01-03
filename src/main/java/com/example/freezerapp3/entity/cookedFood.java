package com.example.freezerapp3.entity;

import java.sql.Timestamp;

public class cookedFood extends Food {
    // Add cooked food attributes


    public cookedFood(String name, double weight, Unit unitOfMeasure, Timestamp dateOfStorage) {
        super(name, weight, unitOfMeasure, dateOfStorage);
    }

    public cookedFood() {
    }


    public cookedFood(String name) {
        super(name);
    }
}
