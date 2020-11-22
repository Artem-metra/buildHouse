package com.company.services;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;

public class HouseService {

    private final List<Floor> floors = new ArrayList<>();

    public void addFloor(Floor floor){
        this.floors.add();
    }


    public void linkHouses(House house,
                           Floor floor,
                           BuildTech buildTech,
                           Material material,
                           Workers workers,
                           double houseFloors){


        Base newBase = new Base();
        Foundation newFoundation = new Foundation();
        Floor newFloor = new Floor();
        Roof newRoof = new Roof();
        

        newBase.setBuildTech(BuildTech.CRANE);
        newBase.setMaterial(Material.CONCRETE);
        newBase.setWorkers(Workers.CRANE_OPERATOR);

        newFoundation.setBuildTech(BuildTech.CONRETE_MIXER);
        newFoundation.setMaterial(Material.SAND);
        newFoundation.setWorkers(Workers.MASON);

    // доделать с этажами




        newRoof.setBuildTech(BuildTech.DUMP_TRUCK);
        newRoof.setMaterial(Material.METAL);
        newRoof.setWorkers(Workers.MASTER);


    }


}
