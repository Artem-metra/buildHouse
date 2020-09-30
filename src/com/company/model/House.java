package com.company.model;

public class House {
    String bildMaterials;                            // Строительные материалы
    String specialEquipment;                         // Какая конкретно техника используется при стройке
    double specialEqiupment_hm;                      //  Какое количетсво техники используется
    String workers;                                  // Какой специальности рабочие работают на стройке
    double workers_hm;                               //  Количество рабочих на стройке


    private int basement;                            // подвал
    private double foundation;
    private int wall;
    private int roof;

    public House(int basement, double foundation, int wall, int roof){
        this.basement = basement;
        this.foundation = foundation;
        this.wall = wall;
        this.roof = roof;
    }


    House(String bildMaterials, String specialEquipment, String workers){
        this.specialEquipment = specialEquipment;
        this.bildMaterials = bildMaterials;
        this.workers = workers;

    }


    public class BasementHouse extends House{
        private int BasementHouse;

        public BasementHouse(int basement, double foundation, int wall, int roof) {
            super(basement, foundation, wall, roof);
        }

        public int getBasementHouse(){
            return BasementHouse;
        }

        public void setBasementHouse(int BasementHouse){
            this.BasementHouse =
        }
    }


    public class foundationHouse{


    }

    public class wallHouse{

    }

    public class roofHouse{

    }

}
