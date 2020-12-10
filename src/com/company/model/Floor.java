package com.company.model;

/**
 * этаж
 */
public class Floor extends BaseProperty{

    private final int numberFloor;

    public Floor(int numberFloor, double square) {
        super(square);
        this.numberFloor = numberFloor;
        this.square = square;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "numberFloor=" + numberFloor +
                ", square=" + square +
                ", materials=" + materials +
                ", buildTechs=" + buildTechs +
                ", workers=" + workers +
                '}';
    }
}