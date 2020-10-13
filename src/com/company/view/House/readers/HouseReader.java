package com.company.view.House.readers;

import com.company.model.House;

public interface HouseReader {
    String getMessage();

    boolean isValidInput(int input);

    void parseInputIntoHouse(int input, House house);

}
