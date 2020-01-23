package com.hackerrank.timeconversion;

public class Main {
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        String[] timeParts = s.split(":");
        String returnTime = "";

        if(timeParts[2].contains("AM")){

            String hour = timeParts[0];
            if(hour.equals("12")){
                hour = "00";
            }

            returnTime =  hour + ":" + timeParts[1] + ":" + timeParts[2].substring(0,2);

        }else{

            int hour = Integer.parseInt(timeParts[0]);

            if(hour != 12){
                hour += 12;
            }



            returnTime = hour + ":" + timeParts[1] + ":" + timeParts[2].substring(0,2);
        }


        return returnTime;
    }

    public static void main(String[] args) {
        String timeInput = "07:05:45PM";
        System.out.println(timeConversion(timeInput));
    }
}
