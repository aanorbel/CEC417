package com.aanorbel.example.leapyear;

public class LeapYearTester {

    public static void main(String[] args) {

        System.out.println("All Leap Years Between 2001 and 2100 \n");

        int count = 0;

        for (int year = 2001; year <= 2100; year++) {

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

                count++;
                System.out.print(year + (count % 10 == 0 ? "\n" : " "));

            }
        }

        System.out.println();

    }

}
