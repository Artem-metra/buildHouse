package com.company.model;

/**
 * крыша
 */
public class Roof {

    private final String typeRoof;

    public Roof(String typeRoof) {
        this.typeRoof = typeRoof;
    }

    public String getTypeRoof() {
        return typeRoof;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "typeRoof='" + typeRoof + '\'' +
                '}';
    }
}
