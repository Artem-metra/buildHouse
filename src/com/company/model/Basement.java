package com.company.model;

/**
 * подвал
 */
public class Basement extends BaseProperty{

    public Basement(Double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "Basement{" +
                "square=" + square +
                ", materials=" + materials +
                ", buildTechs=" + buildTechs +
                ", workers=" + workers +
                '}';
    }
}
