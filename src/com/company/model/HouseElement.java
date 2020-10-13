package com.company.model;

import java.util.Map;

public class HouseElement {

    private Material material;
    private BuildTech buildTech;
    private Workers workers;
    private Map<Workers, Double> requiredWork;
    private double houseFloors;

    public HouseElement(){
        this.material = null;
        this.buildTech = null;
        this.workers = null;
    }




    public void setRequiredWork(Map<com.company.model.Workers, Double> requiredWork) {
        this.requiredWork = requiredWork;
    }


    public void setMaterial(Material material){
        material = material;
    }


    public void setBuildTech(BuildTech BuildTech) {
        buildTech = BuildTech;
    }

    public void setWorkers(Workers workers) {
        workers = workers;
    }

    public void setHouseFloors(double houseFloors) {
        this.houseFloors = houseFloors;
    }
}
