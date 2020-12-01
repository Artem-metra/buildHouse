package com.company.view;

import com.company.model.Construction;
import com.company.model.House;
import com.company.model.HouseInfo;
import com.company.services.HouseService;
import com.company.view.validator.Validator;

import java.util.Scanner;

public class View {

    private HouseService houseService;
    private Scanner scannerString;
    private Scanner scannerNumber;
    private Validator validator;

    public View(){
        houseService = new HouseService();
        scannerString = new Scanner(System.in);
        scannerNumber = new Scanner(System.in);
        validator = new Validator();
    }

    public void start(){
        System.out.println("Добро пожаловать в строительство дома");
        while(true) {
            System.out.println("Чтобы начать строить новый дом введите команду");
            System.out.println("1 - начать, иначе любой символ");
            if (scannerString.nextLine().equals("1")) {
                buildHouse();
                getSmeta();
            } else {
                System.out.println("Досвидания!");
                break;
            }
        }
    }

    private void buildHouse(){
        newBuild();
        basementBuild();
        floorsBuild();
        roofBuild();
    }

    private void getSmeta(){
        System.out.println("Полная информация о строительстве дома:");
        HouseInfo houseInfo = houseService.getHouseInfo();
        House house = houseInfo.getHouse();
        Construction construction = houseInfo.getConstruction();
        System.out.println("Дома:");
        System.out.println("Подвал " + (house.getBasement() != null ? house.getBasement() : "- подвал отсутствует"));
        System.out.println("Этажи " + house.getFloors());
        System.out.println("Крыша " + house.getRoof());
        System.out.println("Строительство:");
        System.out.println("Затраты рабочих" + construction.getWorkers());
        System.out.println("Затраты техники" + construction.getBuildTechs());
        System.out.println("Затраты материалы" + construction.getMaterials());
    }

    private void newBuild(){
        Double d;
        while (true) {
            System.out.println("Введите площадь дома");
            String value = scannerNumber.nextLine();
            try {
                d = validator.checkDouble(value);
                break;
            } catch (Exception e) {
                System.out.println("Пожалуйста введите число типа Double");
            }
        }
        houseService.createNewBuilding(d);
    }

    private void basementBuild(){
        System.out.println("Хотите построить у дома подвал");
        System.out.println("0 - да, иначе любой символ");
        String isBasement = scannerString.nextLine();
        if (isBasement.equals("0")){
            houseService.createBasement();
        }
    }

    private void floorsBuild(){
        Integer i;
        while (true) {
            System.out.println("Введите количество этажей в доме");
            String value = scannerNumber.nextLine();
            try {
                i = validator.checkInt(value);
                break;
            } catch (Exception e) {
                System.out.println("Пожалуйста введите число типа Integer");
            }
        }
        houseService.createFloors(i);
    }

    private void roofBuild(){
        System.out.println("Введите тип крыши в доме");
        houseService.createRoof(scannerString.nextLine());
    }
}
