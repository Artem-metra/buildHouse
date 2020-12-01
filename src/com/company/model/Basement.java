package com.company.model;

/**
 * подвал
 */
public class Basement {

    private double square;

    public Basement(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Basement{" +
                "square=" + square +
                '}';
    }
}
