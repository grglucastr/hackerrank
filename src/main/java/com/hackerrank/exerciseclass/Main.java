package com.hackerrank.exerciseclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        List<Long> sums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            long sum = 0 ;
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }

                sum += arr[j];
            }

            sums.add(sum);
        }

        Collections.sort(sums);

        System.out.println(sums.get(0) + " " + sums.get(sums.size() - 1));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
