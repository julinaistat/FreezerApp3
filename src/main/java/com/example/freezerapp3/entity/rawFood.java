package com.example.freezerapp3.entity;


import java.time.LocalDate;

public class rawFood extends Food {
    // Add raw food attributes


    public rawFood(String name, double weight, Unit unitOfMeasure, LocalDate dateOfStorage) {
        super(name, weight, unitOfMeasure, dateOfStorage);
    }

    public rawFood(String name) {
        super(name);
    }

    public rawFood() {
    }

    public String toString() {
        return super.toString();
    }
}
