package com.udemy.switchstatements;

public class Main {

    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Vaule was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char charValue = 'B';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

    }
}