package com.company.com.common;

import java.util.ArrayList;

/**
 * Created by phillipdelia on 7/25/17.
 */
public enum Month {
    JANUARY ("January"),
    FEBRUARY ("February"),
    MARCH ("March"),
    APRIL ("April"),
    MAY ("May"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMBER ("November"),
    DECEMBER ("December");

    private String englishName;



    Month(String englishName) {

        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }
    public String setEnglishName(String englishName) {
        this.englishName = englishName;
        return englishName;

    }

    public void evaluateMonth(Month enumMonth) {

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

                System.out.print(newList);
        }


    }


    }
