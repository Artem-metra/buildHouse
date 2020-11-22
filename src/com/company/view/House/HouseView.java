package com.company.view.House;

import com.company.model.House;
import com.company.services.HouseService;
import com.company.view.House.readers.FloorReader;
import com.company.view.House.readers.HouseReader;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseView {
    private final HouseService houseService;

    private final static List<HouseReader> READERS =
            Arrays.asList(new FloorReader());

    public HouseView(HouseService houseService) {
        this.houseService = houseService;
    }

    public void runCityCreationProcedure(){
        Scanner scanner = new Scanner(System.in);
        House newHouse = new House();

        for (HouseReader reader: READERS){
            int input;

            do {
                System.out.print(reader.getMessage());
                input = scanner.nextInt();

                if("Выход".equalsIgnoreCase(String.valueOf(input))){
                    System.out.println("Вызодим из создания Дома");
                    return;
                }
            }while (!reader.isValidInput(input));
            reader.parseInputIntoHouse(input, newHouse);
        }

        houseService.linkHouses(newHouse);                                // доделать с этажами(CreateHouse)
        System.out.println("Создан дом с этажами - " + newHouse);
    }
}
