package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        int month;
        int dayOfMonth;
        int retry;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
    do {
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        System.out.println("What year were you born in?");
        year = keyboard.nextInt();
        System.out.println("What month were you born in? In Numerical Value. Ex. January = 1 December = 12");
        month = keyboard.nextInt();
        System.out.println("What day of the month were you born in?");
        dayOfMonth = keyboard.nextInt();

        int daysInMonth = numberOfDaysInMonth(month, year);
        System.out.println("There are " + daysInMonth + " days in that month");

        int dayOfBirth = zellerCongruence(month, year, dayOfMonth);
        System.out.println(dayOfBirth);

        String nurseryRhyme = poem(dayOfBirth);
        System.out.println(nurseryRhyme);


        System.out.println("Would you like to again? yes = 1 or no = 2");
        retry = keyboard.nextInt();
    }
    while (retry == 1);
    }

    public static int numberOfDaysInMonth(int month, int year) {
        switch (month) {
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
                if ((year % 100 == 0 && year % 400 == 0) || (!(year % 100 == 0) && year % 4 ==0)) {
                    return 29;
                } else {
                    return 28;
                }

        }

    }
    public static int zellerCongruence(int month, int year, int daysInMonth){
        if (month == 1 || month == 2){
            month = month +12;
            year--;
        }
        int yearsEndingInZeros;
        yearsEndingInZeros = (year / 100);
        int zeller;
        zeller = (13 * (month + 1));
        int yearOfCentury;
        yearOfCentury = year % 100;
        int dayOfWeek;
        dayOfWeek = ((daysInMonth + ((zeller)/5) + yearOfCentury + (yearOfCentury/4) + ((yearsEndingInZeros) /4) + (5 * (yearsEndingInZeros))) % 7);
        return dayOfWeek;
    }

    public static String poem(int dayofWeek ){

        switch (dayofWeek){
            case 2:
                return "You were born on a Monday \n" +
                        "According to the poem you are fair of face ";
            case 3:
                return "You were born on a Tuesday \n" +
                        "According to the poem you are full of grace ";
            case 4:
                return "You were born on a Wednesday \n" +
                        "According to the poem you are full of woe ";
            case 5:
                return "You were born on a Thursday \n" +
                        "According to the poem you have far of go ";
            case 6:
                return "You were born on a Friday \n" +
                        "According to the poem you are loving and giving";
            case 0:
                return "You were born on a Saturday \n" +
                        "According to the poem you work hard for a living";
            default:
                return "You were born on the Sabbath Day \n" +
                        "According to the poem you are fair and wise in every way ";
        }
    }


}


