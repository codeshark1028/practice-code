package com.company;

    public class DecimalComparator {

        public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

            if ((a - b) == 0)//noinspection MagicConstant
            {
                return true;
            } else if ((a >= 0 && b <= 0) || (a <= 0 && b >= 0)) {

                return false;

            } else if (a > b && a-b == 0.0009) {

                return true;
            } else if (b > a && b-a == 0.0009) {
                return true;
            }


            return false;


        }

        public static void main(String[] args) {

           boolean result = areEqualByThreeDecimalPlaces(1.234, 1.456);
            System.out.println(result);
        }


    }




