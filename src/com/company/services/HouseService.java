package com.company.services;

import com.company.model.Basement;
import com.company.model.Floor;
import com.company.model.HouseInfo;
import com.company.model.Roof;
import com.company.model.enums.BuildTech;
import com.company.model.enums.Material;
import com.company.model.enums.Worker;

public class HouseService {

    private HouseInfo houseInfo;

    public HouseService() {
    }

    public void createNewBuilding(double square) {
        houseInfo = new HouseInfo(square);
    }

    public void createBasement() {
        houseInfo.getConstruction().addMaterials(Material.BRICKS, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.CEMENT, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.METAL, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.SAND, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.RUBBLE, houseInfo.getSquare());
        houseInfo.getConstruction().addBuildTech(BuildTech.CONCRETE_MIXER, houseInfo.getSquare());
        houseInfo.getConstruction().addBuildTech(BuildTech.EXCAVATOR, houseInfo.getSquare());
        houseInfo.getConstruction().addBuildTech(BuildTech.DUMP_TRUCK, houseInfo.getSquare());
        houseInfo.getConstruction().addRequiredWork(Worker.MASON, houseInfo.getSquare());
        houseInfo.getConstruction().addRequiredWork(Worker.MASTER, houseInfo.getSquare());
        houseInfo.getConstruction().addRequiredWork(Worker.PLASTERER, houseInfo.getSquare());

        houseInfo.getHouse().setBasement(new Basement(houseInfo.getSquare()));
    }

    public void createFloors(double count) {
        for (int i=1; i<=count; i++){
            houseInfo.getConstruction().addMaterials(Material.BRICKS, houseInfo.getSquare());
            houseInfo.getConstruction().addMaterials(Material.CEMENT, houseInfo.getSquare());
            houseInfo.getConstruction().addMaterials(Material.METAL, houseInfo.getSquare());
            houseInfo.getConstruction().addMaterials(Material.SAND, houseInfo.getSquare());
            houseInfo.getConstruction().addMaterials(Material.RUBBLE, houseInfo.getSquare());
            houseInfo.getConstruction().addBuildTech(BuildTech.CONCRETE_MIXER, houseInfo.getSquare());
            houseInfo.getConstruction().addBuildTech(BuildTech.EXCAVATOR, houseInfo.getSquare());
            houseInfo.getConstruction().addBuildTech(BuildTech.CRANE, houseInfo.getSquare());
            houseInfo.getConstruction().addRequiredWork(Worker.MASON, houseInfo.getSquare());
            houseInfo.getConstruction().addRequiredWork(Worker.MASTER, houseInfo.getSquare());

            houseInfo.getHouse().addFloor(new Floor(i, houseInfo.getSquare()));
        }
    }

    public void createRoof(String typeRoof){
        houseInfo.getConstruction().addMaterials(Material.BRICKS, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.CEMENT, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.METAL, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.SAND, houseInfo.getSquare());
        houseInfo.getConstruction().addMaterials(Material.RUBBLE, houseInfo.getSquare());
        houseInfo.getConstruction().addBuildTech(BuildTech.CONCRETE_MIXER, houseInfo.getSquare());
        houseInfo.getConstruction().addBuildTech(BuildTech.EXCAVATOR, houseInfo.getSquare());
        houseInfo.getConstruction().addBuildTech(BuildTech.CRANE, houseInfo.getSquare());
        houseInfo.getConstruction().addRequiredWork(Worker.MASON, houseInfo.getSquare());
        houseInfo.getConstruction().addRequiredWork(Worker.MASTER, houseInfo.getSquare());
        houseInfo.getConstruction().addRequiredWork(Worker.PLASTERER, houseInfo.getSquare());

        houseInfo.getHouse().setRoof(new Roof(typeRoof));
    }

    public HouseInfo getHouseInfo() {
        return this.houseInfo;
    }
}