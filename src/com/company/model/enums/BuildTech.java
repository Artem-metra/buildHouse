package com.company.model.enums;

public enum BuildTech{

    /**
     * бетономешалка
     */
    CONCRETE_MIXER(5),

    /**
     * подъемный кран
     */
    CRANE(4),

    /**
     * самосвал
     */
    DUMP_TRUCK(8),

    /**
     * экскаватор
     */
    EXCAVATOR(2);

    /**
     * трудовые затраты на 1м^2
     */
    private int laborCosts;

    BuildTech(int laborCosts){
        this.laborCosts = laborCosts;
    }

    public double getLaborCosts() {
        return laborCosts;
    }
}

