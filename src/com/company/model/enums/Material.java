package com.company.model.enums;

public enum Material{

    /**
     * деревр
     */
    WOOD(2, "куб."),

    /**
     * метал
     */
    METAL(5, "кг"),

    /**
     * бетон
     */
    CONCRETE(3, "куб."),

    /**
     * песок
     */
    SAND(1, "куб."),

    /**
     * щебень
     */
    RUBBLE(4, "куб."),

    /**
     * кирпичи
     */
    BRICKS(4, "шт."),

    /**
     * цемент
     */
    CEMENT(4, "куб.");

    /**
     * сложность использования на 1м^2
     */
    private final double complexityOfUse;

    /**
     * единицы измерения
     */
    private final String unit;

    Material(double complexityOfUse, String unit) {
        this.complexityOfUse = complexityOfUse;
        this.unit = unit;
    }

    public double getComplexityOfUse() {
        return complexityOfUse;
    }

    public String getUnit() {
        return unit;
    }
}