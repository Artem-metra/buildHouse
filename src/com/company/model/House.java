package com.company.model;

import java.util.List;

public class House {

    private Foundation houseFoundation;
    private List<Floor> floors;
    private Roof houseRoof;
    private Base houseBase;

    public House() {
        this.houseFoundation = null;
        this.houseRoof = null;
        this.houseBase = null;
    }

    public Foundation getHouseFoundation() {
        return houseFoundation;
    }

    public void setHouseFoundation(Foundation houseFoundation) {
        this.houseFoundation = houseFoundation;
    }

    public Roof getHouseRoof() {
        return houseRoof;
    }

    public void setHouseRoof(Roof houseRoof) {
        this.houseRoof = houseRoof;
    }

    public Base getHouseBase() {
        return houseBase;
    }

    public void setHouseBase(Base houseBase) {
        this.houseBase = houseBase;
    }
}