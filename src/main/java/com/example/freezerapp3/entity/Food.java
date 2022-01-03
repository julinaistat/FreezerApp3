package com.example.freezerapp3.entity;







//make it abstract as soon as you can

import java.time.LocalDate;

public class Food {


    private String name;
    private double weight;
    private Unit unitOfMeasure;
    private LocalDate dateOfStorage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Unit getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(Unit unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public LocalDate getDateOfStorage() {
        return dateOfStorage;
    }

    public void setDateOfStorage(LocalDate dateOfStorage) {
        this.dateOfStorage = dateOfStorage;
    }

    public Food(String name, double weight, Unit unitOfMeasure, LocalDate dateOfStorage) {
        this.name = name;
        this.weight = weight;
        this.unitOfMeasure = unitOfMeasure;
        this.dateOfStorage = dateOfStorage;
    }

    public Food(String name) {
        this.name = name;
    }

    public Food() {
    }

    public String toString3() {
        return "Name: " + name + '\n' +
                "Weight: " + weight + '\n' +
                "Unit: " + unitOfMeasure + '\n' +
                "Date: " + dateOfStorage;
    }


    public String toString22NOPE() {
        return "Food{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", unitOfMeasure=" + unitOfMeasure +
                ", dateOfStorage=" + dateOfStorage +
                '}';
    }

    public String toString(){
        return "There's " + weight + " " + unitOfMeasure + " of " + name + " since " + dateOfStorage;
    }
}
