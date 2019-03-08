package com.udemy.logic;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args){

        printYearsAndDays(564);
    }
        public static void printYearsAndDays(long minutes){
            if (minutes < 0)
                System.out.print("Invalid Value");
            else{
                System.out.println(minutes + " min = " + minutes / 525600 + " y" +" and " + ((minutes % 525600) / 60) / 24 + " d");
            }
        }

}
