package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        int dayOfMonth;
        int month;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");

        int daysInMonth = numberOfDaysInMonth(month, year);
        System.out.println("There are " + daysInMonth + " in that month");
    }

    public static int numberOfDaysInMonth(int year, int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
            case 12:
                return 31;


            case 4:
            case 6:
            case 7:
            case 11:
                return 30;

            default:
                if ((year % 100 == 0 && year % 400 == 0) || (!(year % 100 == 0) && year % 4 == 0)){
                    return 29;
                }else {
                    return 28;
                }
        }
    }
    
}

