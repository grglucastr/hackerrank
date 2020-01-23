package com.hackerrank.birthdaycandles;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        Arrays.sort(ar);

        int max = ar[ar.length -1];
        int candles = 0;

        for(int item : ar){
            if(item == max){
                candles++;
            }
        }

        return candles;
    }

    public static void main(String[] args) throws IOException {

        int ar[] = {5,3,5,4, 5};
        int result = birthdayCakeCandles(ar);


    }
}
