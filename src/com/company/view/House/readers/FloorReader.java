package com.company.view.House.readers;

import com.company.model.House;

public class FloorReader implements HouseReader{

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public boolean isValidInput(int input) {
        return false;
    }

    @Override
    public void parseInputIntoHouse(int input, House house) {
        // количество этажей
    }
}
