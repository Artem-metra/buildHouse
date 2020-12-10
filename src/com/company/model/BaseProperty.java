package com.company.model;

import com.company.model.enums.BuildTech;
import com.company.model.enums.Material;
import com.company.model.enums.Worker;

import java.util.HashMap;
import java.util.Map;

public class BaseProperty {

    protected double square;
    protected Map<Material, Double> materials;
    protected Map<BuildTech, Double> buildTechs;
    protected Map<Worker, Double> workers;

    public BaseProperty(Double square) {
        this.square = square;
        materials = new HashMap<>();
        buildTechs = new HashMap<>();
        workers = new HashMap<>();
    }

    public void addMaterials(Material material){
        if (materials.containsKey(material)) {
            Double newValue = materials.get(material) + material.getComplexityOfUse() * square;
            materials.put(material, newValue);
            return;
        }
        materials.put(material, material.getComplexityOfUse() * square);
    }

    public void addBuildTech(BuildTech buildTech){
        if (buildTechs.containsKey(buildTech)) {
            Double newValue = buildTechs.get(buildTech) + buildTech.getLaborCosts() * square;
            buildTechs.put(buildTech, newValue);
            return;
        }
        buildTechs.put(buildTech, buildTech.getLaborCosts() * square);
    }

    public void addRequiredWork(Worker worker){
        if (workers.containsKey(worker)) {
            Double newValue = workers.get(worker) + worker.getLaborCosts() * square;
            workers.put(worker, newValue);
            return;
        }
        workers.put(worker, worker.getLaborCosts() * square);
    }

    public Map<Material, Double> getMaterials() {
        return materials;
    }

    public Map<BuildTech, Double> getBuildTechs() {
        return buildTechs;
    }

    public Map<Worker, Double> getWorkers() {
        return workers;
    }
}
