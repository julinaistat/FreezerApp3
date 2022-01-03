package com.example.freezerapp3.entity;







//make it abstract as soon as you can

import java.sql.Timestamp;

public class Food {


    private String name;
    private double weight;
    private Unit unitOfMeasure;
    private Timestamp dateOfStorage;

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

    public String getUnitOfMeasure() {
        return String.valueOf(unitOfMeasure);
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        unitOfMeasure = unitOfMeasure.toString();
    }

    public Timestamp getDateOfStorage() {
        return dateOfStorage;
    }

    public void setDateOfStorage(Timestamp dateOfStorage) {
        this.dateOfStorage = dateOfStorage;
    }

    public Food(String name, double weight, Unit unitOfMeasure, Timestamp dateOfStorage) {
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
