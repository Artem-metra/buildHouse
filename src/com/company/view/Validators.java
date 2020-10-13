package com.company.view;

import java.util.Arrays;
import java.util.List;

public class Validators {

    public static boolean isValidDouble(String doubleStr) {
        try {
            Double.parseDouble(doubleStr);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
