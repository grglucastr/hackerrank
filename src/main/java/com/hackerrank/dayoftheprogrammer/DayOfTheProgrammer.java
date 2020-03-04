package com.hackerrank.dayoftheprogrammer;

public class DayOfTheProgrammer {


    public String get(int year) {
        int day = 12;

        if(year == 1918){
            day = 256-230;
            return day+".09."+year;
        }

        if(year < 1919){
            // compute for julian year

            if(year % 4 == 0){
                day = 256-244;
            }else{
                day = 256-243;
            }

        }else{

            if((year % 400 == 0) || (year % 4 == 0) && !(year % 100 == 0)) {
                day = 256-244;
            } else {
                day = 256-243;
            }

        }

        return day+".09."+year;

    }
}
