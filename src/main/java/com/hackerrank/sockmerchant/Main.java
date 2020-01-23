package com.hackerrank.sockmerchant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static int sockMerchant(int n, int[] ar) {

        int result = 0;
        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i < n; i++) {
            colors.add(ar[i]);
        }


        for(Iterator<Integer> it = colors.iterator(); it.hasNext();){
            int color = it.next();
            int count = 0;
            int qtyPair = 0;

            for (int i = 0; i < ar.length ; i++) {
                if(ar[i] == color){
                    count++;

                    if(count == 2){
                        qtyPair++;
                        count = 0;
                    }

                }
            }

            if(qtyPair > 0){
                result += qtyPair;
            }

        }


        return result;

    }


    public static void main(String[] args) {

        int n = 9;
        int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(n, arr);

        System.out.println("result -----> " + result);
    }

}
