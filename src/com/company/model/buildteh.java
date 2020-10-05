package com.company.model;

public class buildteh {

    public enum BuildtehType{
        conrete_mixer,
        crane,
        dump_truck,
        excavator
    }

    private BuildtehType BType;

    public BuildtehType getBType(){
        return BType;
    }

    public void setBType(BuildtehType BType) {
        this.BType = BType;
    }
}
