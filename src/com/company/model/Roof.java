package com.company.model;

/**
 * крыша
 */
public class Roof extends BaseProperty{

    private final String typeRoof;

    public Roof(String typeRoof, Double square) {
        super(square);
        this.typeRoof = typeRoof;
    }

    public String getTypeRoof() {
        return typeRoof;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "typeRoof='" + typeRoof + '\'' +
                ", square=" + square +
                ", materials=" + materials +
                ", buildTechs=" + buildTechs +
                ", workers=" + workers +
                '}';
    }
}
