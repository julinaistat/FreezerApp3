package com.example.freezerapp3.entity;

public enum Unit {
    LTS("lts"), KG("kg"), GR("gr"), ML("ml");

    private String unitName;

    private Unit(String unitName) {
        this.unitName = unitName;
    }

    public String toString() {
        return unitName;
    }
}
