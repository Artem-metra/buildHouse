package com.company.model;

public class HouseInfo {

    private final Double square;
    private final House house;
    private final Construction construction;

    public HouseInfo(Double square) {
        this.square = square;
        house = new House();
        construction = new Construction();
    }

    public House getHouse() {
        return house;
    }

    public Construction getConstruction() {
        return construction;
    }

    public Double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "square=" + square +
                ", house=" + house +
                ", construction=" + construction +
                '}';
    }
}
