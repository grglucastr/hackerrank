package com.hackerrank.breakingrecords;

public class Main {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int min = 0;
        int max = 0;
        int mini = scores[0];
        int maxi = scores[0];

        for(int i = 1; i < scores.length; i++){
            if(scores[i] > maxi){
                max++;
                maxi = scores[i];
            }else if(scores[i] < mini){
                min++;
                mini = scores[i];
            }
        }

        return new int[]{max, min};

    }

    public static void main(String[] args) {

    }
}
