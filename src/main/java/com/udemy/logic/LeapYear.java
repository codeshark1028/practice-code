package com.company;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if ((year >= 1 && year <= 9999) && (year % 4 == 0 || year % 400 == 0 || year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean result = isLeapYear(999999);
        System.out.println(result);
    }

}