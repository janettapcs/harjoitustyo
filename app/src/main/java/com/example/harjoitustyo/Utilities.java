package com.example.harjoitustyo;

public class Utilities {

    public static int strToInt(String value){

        try {
            int newInt = Integer.parseInt(value);
            return newInt;

        }
        catch (NumberFormatException e) {
            System.out.println("error");

            return -1;
        }


    }
}

