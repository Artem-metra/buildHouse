package com.company.model;

import com.company.model.enums.BuildTech;
import com.company.model.enums.Material;
import com.company.model.enums.Worker;

import java.util.HashMap;
import java.util.Map;

public class Construction {

    private Map<Material, Double> materials;
    private Map<BuildTech, Double> buildTechs;
    private Map<Worker, Double> workers;

    public Construction(){
        materials = new HashMap<>();
        buildTechs = new HashMap<>();
        workers = new HashMap<>();
    }

    public void addMaterials(Material material, Double count){
        if (materials.containsKey(material)) {
            Double newValue = materials.get(material) + material.getComplexityOfUse() * count;
            materials.put(material, newValue);
            return;
        }
        materials.put(material, material.getComplexityOfUse() * count);
    }

    public void addBuildTech(BuildTech buildTech, Double count){
        if (buildTechs.containsKey(buildTech)) {
            Double newValue = buildTechs.get(buildTech) + buildTech.getLaborCosts() * count;
            buildTechs.put(buildTech, newValue);
            return;
        }
        buildTechs.put(buildTech, buildTech.getLaborCosts() * count);
    }

    public void addRequiredWork(Worker worker, Double count){
        if (workers.containsKey(worker)) {
            Double newValue = workers.get(worker) + worker.getLaborCosts() * count;
            workers.put(worker, newValue);
            return;
        }
        workers.put(worker, worker.getLaborCosts() * count);
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

    @Override
    public String toString() {
        return "Construction{" +
                "materials=" + materials +
                ", buildTechs=" + buildTechs +
                ", workers=" + workers +
                '}';
    }
}