package com.company.model;



    public enum Material{
        WOOD(2),
        METAL(5),
        CONCRETE(3),
        SAND(1),
        RUBBLE(4);


       private double complexityOfUse;

       Material(double complexityOfUse){
           this.complexityOfUse = complexityOfUse;
       }

        public double getComplexityOfUse() {
            return complexityOfUse;
        }
    }