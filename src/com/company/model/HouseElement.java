package com.company.model;

import java.util.Map;

public class HouseElement {

    private Material Material;
    private BuildTech BuildTech;
    private com.company.model.Workers Workers;
    private Map<Workers, Double> requiredWork;
    private double houseFloors;

    public HouseElement(){
        this.Material = null;
        this.BuildTech = null;
        this.Workers = null;
    }




    public void setRequiredWork(Map<com.company.model.Workers, Double> requiredWork) {
        this.requiredWork = requiredWork;
    }


    public void setMaterial(Material material){
        Material = material;
    }


    public void setBuildTech(BuildTech BuildTech) {
        BuildTech = BuildTech;
    }

    public void setWorkers(Workers workers) {
        Workers = workers;
    }

    public void setHouseFloors(double houseFloors) {
        this.houseFloors = houseFloors;
    }
}
