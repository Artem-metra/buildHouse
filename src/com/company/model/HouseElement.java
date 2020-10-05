package com.company.model;

public class HouseElement {

    private material Material;
    private buildteh Buildteh;
    private workers Workers;

    public HouseElement(){
        this.Material = null;
        this.Buildteh = null;
        this.Workers = null;
    }




    public void setMaterial(material Material) {
        Material = Material;
    }

    public void setBuildteh(buildteh Buildteh) {
        Buildteh = Buildteh;
    }

    public void setWorkers(workers Workers) {
        Workers = Workers;
    }

}
