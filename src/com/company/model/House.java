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

    public Foundation getHouseFoundation() {
        return houseFoundation;
    }

    public void setHouseFoundation(Foundation houseFoundation) {
        this.houseFoundation = houseFoundation;
    }

    public Wall getHouseWall() {
        return houseWall;
    }

    public void setHouseWall(Wall houseWall) {
        this.houseWall = houseWall;
    }

    public Roof getHouseRoof() {
        return houseRoof;
    }

    public void setHouseRoof(Roof houseRoof) {
        this.houseRoof = houseRoof;
    }

    public Base getHouseBase(){
        return houseBase;
    }

    public void setHouseBase(Base houseBase) {
        this.houseBase = houseBase;
    }



//    Создание отдельных элементов дома

    public void CreateHouseFondation(){
        houseFoundation = new Foundation();

    }

    public void CreateHouseWall(){
        houseWall = new Wall();
    }

    public void CreateHouseRoof(){
        houseRoof = new Roof();
    }

    public void CreateHouseBase(){
        houseBase = new Base();
    }
}
