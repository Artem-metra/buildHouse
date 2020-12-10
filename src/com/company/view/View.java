package com.company.view;

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
            System.out.println("0 - начать, иначе любой символ");
            if (scannerString.nextLine().equals("0")) {
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
        System.out.println("Какую информацию о строительстве вы хотите получить:");
        boolean showInformation = true;
        while (showInformation) {
            System.out.println("1 - Информация о каждом компоненте");
            System.out.println("2 - Информация о строительных затратах");
            System.out.println("3 - Информация об затратах на подвал");
            System.out.println("4 - Информация об затратах на этаж");
            System.out.println("5 - Информация об затратах на крышу");
            switch (scannerString.nextLine()) {
                case "1":
                    System.out.println("Информация о каждом компоненте:");
                    System.out.println("Подвал " + (houseService.getBasement() != null ? houseService.getBasement() : "- подвал отсутствует"));
                    System.out.println("Этажи " + houseService.getFloors());
                    System.out.println("Крыша " + houseService.getRoof());
                    break;
                case "2":
                    System.out.println("Информация о строительных затратах");
                    System.out.println("Затраты рабочих " + houseService.getWorkers());
                    System.out.println("Затраты техники " + houseService.getBuildTechs());
                    System.out.println("Затраты материалы " + houseService.getMaterials());
                    break;
                case "3":
                    System.out.println("Информация об затратах на подвал");
                    System.out.println("Затраты на подвал " + houseService.getBasement() != null ?
                            houseService.getBasement() : "подвал отсутствует");
                    break;
                case "4":
                    System.out.println("Введите номер этажа");
                    int numberFloor = scannerNumber.nextInt();
                    System.out.println("Информация об затратах на этаж");
                    System.out.println("Затраты на " + numberFloor + " этаж " + houseService.getFloor(numberFloor));
                    break;
                case "5":
                    System.out.println("Информация об затратах на крыше");
                    System.out.println("Затраты на подвал " + houseService.getBasement());
                    break;
                default:
                    showInformation = false;
            }
        }
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
