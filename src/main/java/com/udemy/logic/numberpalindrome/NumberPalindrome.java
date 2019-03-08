package com.udemy.logic.numberpalindrome;

public class NumberPalindrome {
    public boolean isPalindrome(int number) {

        int palindrome = number;

        int reverse = 0;


        while (number != 0) {
            int lastDigit = 0;

            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;

        }

        if (palindrome == reverse) {

            return true;

        }

        return false;

    }
}
