package com.practice.freezerapp;

public abstract class Food {

    private String name;
    private double weight;

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


    public Food(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public Food() {
    }

    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String foodDetails(){
        String foodDetails = "Hay " + this.weight + " de " + this.name;
        return foodDetails;
    }
}
