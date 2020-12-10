package com.company.services;

import com.company.model.Basement;
import com.company.model.Floor;
import com.company.model.House;
import com.company.model.Roof;
import com.company.model.enums.BuildTech;
import com.company.model.enums.Material;
import com.company.model.enums.Worker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseService {

    private House house;
    private Map<Material, Double> materials;
    private Map<BuildTech, Double> buildTechs;
    private Map<Worker, Double> workers;

    public HouseService() {
    }

    public void createNewBuilding(double square) {
        house = new House(square);
    }

    public void createBasement() {
        Basement basement = new Basement(house.getSquare());
        basement.addMaterials(Material.BRICKS);
        basement.addMaterials(Material.CEMENT);
        basement.addMaterials(Material.METAL);
        basement.addMaterials(Material.SAND);
        basement.addMaterials(Material.RUBBLE);
        basement.addBuildTech(BuildTech.CONCRETE_MIXER);
        basement.addBuildTech(BuildTech.EXCAVATOR);
        basement.addBuildTech(BuildTech.DUMP_TRUCK);
        basement.addRequiredWork(Worker.MASON);
        basement.addRequiredWork(Worker.MASTER);

        house.setBasement(basement);
    }

    public void createFloors(double count) {
        for (int i=1; i<=count; i++){
            Floor floor = new Floor(i, house.getSquare());
            floor.addMaterials(Material.BRICKS);
            floor.addMaterials(Material.CEMENT);
            floor.addMaterials(Material.METAL);
            floor.addMaterials(Material.SAND);
            floor.addMaterials(Material.RUBBLE);
            floor.addBuildTech(BuildTech.CONCRETE_MIXER);
            floor.addBuildTech(BuildTech.EXCAVATOR);
            floor.addBuildTech(BuildTech.CRANE);
            floor.addRequiredWork(Worker.MASON);
            floor.addRequiredWork(Worker.MASTER);

            house.addFloor(floor);
        }
    }

    public void createRoof(String typeRoof){
        Roof roof = new Roof(typeRoof, house.getSquare());
        roof.addMaterials(Material.BRICKS);
        roof.addMaterials(Material.CEMENT);
        roof.addMaterials(Material.METAL);
        roof.addMaterials(Material.SAND);
        roof.addMaterials(Material.RUBBLE);
        roof.addBuildTech(BuildTech.CONCRETE_MIXER);
        roof.addBuildTech(BuildTech.EXCAVATOR);
        roof.addBuildTech(BuildTech.CRANE);
        roof.addRequiredWork(Worker.MASON);
        roof.addRequiredWork(Worker.MASTER);

        house.setRoof(roof);
    }

    public House getHouse() {
        return house;
    }

    public Basement getBasement(){
        return house.getBasement();
    }

    public List<Floor> getFloors(){
        return house.getFloors();
    }

    public Floor getFloor(final int numberFloor){
        return house.getFloors().stream()
                .filter(floor -> floor.getNumberFloor() == numberFloor).findFirst().get();
    }

    public Roof getRoof(){
        return house.getRoof();
    }

    public Map<Material, Double> getMaterials() {
        if (materials != null) {
            return materials;
        }
        materials = new HashMap<>();
        materials.putAll(house.getBasement().getMaterials());
        for (Floor fl: house.getFloors()){
            materials.putAll(fl.getMaterials());
        }
        materials.putAll(house.getRoof().getMaterials());
        return materials;
    }

    public Map<BuildTech, Double> getBuildTechs(){
        if (buildTechs != null) {
            return buildTechs;
        }
        buildTechs = new HashMap<>();
        buildTechs.putAll(house.getBasement().getBuildTechs());
        for (Floor fl: house.getFloors()){
            buildTechs.putAll(fl.getBuildTechs());
        }
        buildTechs.putAll(house.getRoof().getBuildTechs());
        return buildTechs;
    }

    public Map<Worker, Double> getWorkers(){
        if (workers != null) {
            return workers;
        }
        workers = new HashMap<>();
        workers.putAll(house.getBasement().getWorkers());
        for (Floor fl: house.getFloors()){
            workers.putAll(fl.getWorkers());
        }
        workers.putAll(house.getRoof().getWorkers());
        return workers;
    }
}