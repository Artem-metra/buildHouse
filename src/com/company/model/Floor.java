package com.company.model;

/**
 * этаж
 */
public class Floor {

    private final int numberFloor;
    private final double square;

    public Floor(int numberFloor, double square) {
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
                '}';
    }
}
