package com.company.model;

public class workers {

  public   enum WorkersType{
        crane_operator,
        plasterer,
        mason,
        master
    }

    private WorkersType WType;

    public WorkersType getWType() {
        return WType;
    }

    public void setWType(WorkersType WType) {
        this.WType = WType;
    }
}
