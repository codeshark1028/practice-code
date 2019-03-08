package com.company;

public class EqualSumChecker {

        public static boolean hasEqualSum (int a, int b, int c){

            return (int) (a + b) == (int) (c) ? true : false;
        }

    public static void main(String[] args) {

        boolean result = hasEqualSum (42, 56, 32);
        System.out.println(result);
    }
}
