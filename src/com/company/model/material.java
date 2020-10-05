package com.company.model;

public class material {

    public enum MaterialType{
        wood,
        metal,
        concrete,
        sand,
        rubble
    }

    private MaterialType MType;

    public MaterialType getMType(){
        return MType;
    }

    public void setMType(MaterialType MType) {
        this.MType = MType;
    }
}
