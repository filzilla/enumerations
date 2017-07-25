package com.company;



import com.company.com.common.Month;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please pick a Month.");

        String monthChosen = scanner.nextLine();

        monthChosen = monthChosen.toUpperCase();

        Month enumMonth = Month.valueOf(monthChosen);


        evaluateMonth(enumMonth);
    }

        public static String evaluateMonth(Month enumMonth){

            ArrayList<String> newList = new ArrayList();

            switch (enumMonth) {

                case JANUARY:
                    newList.add(Month.JANUARY.getEnglishName());

                case FEBRUARY:
                    newList.add(Month.FEBRUARY.getEnglishName());

                case MARCH:
                    newList.add(Month.MARCH.getEnglishName());

                case APRIL:
                    newList.add(Month.APRIL.getEnglishName());

                case MAY:
                    newList.add(Month.MAY.getEnglishName());

                case JUNE:
                    newList.add(Month.JUNE.getEnglishName());

                case JULY:
                    newList.add(Month.JULY.getEnglishName());

                case AUGUST:
                    newList.add(Month.AUGUST.getEnglishName());

                case SEPTEMBER:
                    newList.add(Month.SEPTEMBER.getEnglishName());

                case OCTOBER:
                    newList.add(Month.OCTOBER.getEnglishName());

                case NOVEMBER:
                    newList.add(Month.NOVEMBER.getEnglishName());

                case DECEMBER:
                    newList.add(Month.DECEMBER.getEnglishName());
                    default:
                        System.out.println("These are the months subsequent and including your choice: "+ newList);


            }

            return "yep";

        }




    }






