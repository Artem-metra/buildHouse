package com.company.view;

import java.util.Arrays;
import java.util.List;

public class Validators {
    private static final List<Character> LETTERS =
            Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static boolean hasNoLetters(String s) {
        for (Character letters : LETTERS) {
            if (s.indexOf(letters) != -1) {
                return false;
            }
        }

        return true;
    }
    public static boolean isValidDouble(String doubleStr) {
        try {
            Double.parseDouble(doubleStr);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
