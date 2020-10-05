package com.company;

import com.company.model.*;

public class Main {



    public static void main(String[] args) {

    House NewHouse;
    NewHouse = new House();

    // Foundation

        Foundation NewFoundation = new Foundation();
        material Fmateril = new material();
        Fmateril.setMType(material.MaterialType.wood);

        buildteh Fbuildteh = new buildteh();
        Fbuildteh.setBType(buildteh.BuildtehType.conrete_mixer);

        workers Fworkers = new workers();
        Fworkers.setWType(workers.WorkersType.mason);


        NewFoundation.setMaterial(Fmateril);
        NewFoundation.setBuildteh(Fbuildteh);
        NewFoundation.setWorkers(Fworkers);

        NewHouse.setHouseFoundation(NewFoundation);

    // Base

        Base NewBase = new Base();
        material Bmaterial = new material();
        Bmaterial.setMType(material.MaterialType.metal);

        buildteh Bbuildteh = new buildteh();
        Bbuildteh.setBType(buildteh.BuildtehType.dump_truck);

        workers Bworkers = new workers();
        Bworkers.setWType(workers.WorkersType.master);


        NewBase.setMaterial(Bmaterial);
        NewBase.setBuildteh(Bbuildteh);
        NewBase.setWorkers(Bworkers);

        NewHouse.setHouseBase(NewBase);

    // Wall

        Wall NewWall = new Wall();
        material Wmateril = new material();
        Wmateril.setMType(material.MaterialType.sand);

        buildteh Wbuildteh = new buildteh();
        Wbuildteh.setBType(buildteh.BuildtehType.crane);

        workers Wworkers = new workers();
        Wworkers.setWType(workers.WorkersType.plasterer);


        NewWall.setMaterial(Wmateril);
        NewWall.setBuildteh(Wbuildteh);
        NewWall.setWorkers(Wworkers);

        NewHouse.setHouseWall(NewWall);


    // Roof

        Roof NewRoof = new Roof();
        material Rmaterial = new material();
        Rmaterial.setMType(material.MaterialType.rubble);

        buildteh Rbuildteh = new buildteh();
        Rbuildteh.setBType(buildteh.BuildtehType.excavator);

        workers Rworkers = new workers();
        Rworkers.setWType(workers.WorkersType.crane_operator);



        NewRoof.setMaterial(Rmaterial);
        NewRoof.setBuildteh(Rbuildteh);
        NewRoof.setWorkers(Rworkers);

        NewHouse.setHouseRoof(NewRoof);


    
    }
}
