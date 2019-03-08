package com.udemy.logic;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }

        int lastDigit = number % 10;

        while(number >= 10) {
            number = number / 10;

        }   return number + lastDigit;


    }

    public static void main(String[] args) {
        int result = sumFirstAndLastDigit(378);
        System.out.println(result);
    }
}
