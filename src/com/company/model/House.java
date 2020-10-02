package com.company.model;

public class House {

    private Foundation houseFoundation;
    private Wall houseWall;
    private Roof houseRoof;
    private Base houseBase;

    public House(){
        this.houseFoundation = null;
        this.houseWall = null;
        this.houseRoof = null;
        this.houseBase = null;
    }

    public class CreateHouseFondation(){
        houseFoundation = new Foundation();

    }

    public class CreateHouseWall(){
        houseWall = new Wall();
    }

    public class CreateHouseRoof(){
        houseRoof = new Roof();
    }

    public class CreateHouseBase(){
        housebase = new Base();
    }
}
