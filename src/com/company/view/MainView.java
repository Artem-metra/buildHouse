package com.company.view;


import com.company.view.House.HouseView;

import java.util.Scanner;

public class MainView {

    private final HouseView houseView;

    public MainView(HouseView houseView) {
        this.houseView = houseView;
    }

    public void showMainView(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "создать город":
                    houseView.runCityCreationProcedure();
                    break;
                case "выход":
                    System.out.println("Завершаем работу...");
                    return;
            }
        } while (!Thread.interrupted());
    }
}
