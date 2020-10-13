package com.company.services;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;

public class CreateHouse {

    public void linkHouses(House house,
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



    }


}
