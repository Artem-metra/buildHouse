package com.company.model.enums;

public enum Worker {

    /**
     * крановщик
     */
    CRANE_OPERATOR(3),

    /**
     * штукатура
     */
    PLASTERER(8),

    /**
     * каменщик
     */
    MASON(7),

    /**
     * мастера по сантехнике и электрике
     */
    MASTER(10),

    /**
     * мастер кровли
     */
    ROOF_MASTER(9);

    /**
     * трудозатраты на площадь 1м^2
     */
    private final double laborCosts;

    Worker(double laborCosts) {
        this.laborCosts = laborCosts;
    }

    public double getLaborCosts() {
        return laborCosts;
    }
}
