package com.company.model;

    public enum BuildTech{
        CONRETE_MIXER(5),
        CRANE(4),
        DUMP_TRUCK(8),
        EXCAVATOR(2);



    private int laborCosts;

    BuildTech(int laborCosts){
        this.laborCosts = laborCosts;
    }

    public double getLaborCosts() {
        return laborCosts;
    }

    }

