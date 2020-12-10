package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class House {

    private Double square;
    private Basement basement;
    private List<Floor> floors;
    private Roof roof;

    public House(Double square) {
        this.square = square;
        floors = new ArrayList<>();
    }

    public void setBasement(Basement basement) {
        this.basement = basement;
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Basement getBasement() {
        return basement;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public Roof getRoof() {
        return roof;
    }

    public Double getSquare() {
        return square;
    }

    public House setSquare(Double square) {
        this.square = square;
        return this;
    }

    @Override
    public String toString() {
        return "House{" +
                "basement=" + basement +
                ", floors=" + floors +
                ", roof=" + roof +
                '}';
    }
}
