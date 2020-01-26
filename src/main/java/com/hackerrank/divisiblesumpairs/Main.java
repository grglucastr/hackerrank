package com.hackerrank.divisiblesumpairs;

public class Main {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int qty = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int sum = (ar[i] + ar[j]) ;
                if(sum % k == 0){
                    qty++;
                }
            }
        }
        return qty;

    }

    public static void main(String[] args) {

    }
}
