package com.hackerrank.appleandorage;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Main {
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        IntPredicate fruitsInHouse = fruit -> fruit >= s && fruit <= t;

        int totalApples[];
        int totalOranges[];

        apples = Arrays.stream(apples).map(apple -> apple + a).toArray();
        oranges = Arrays.stream(oranges).map(orange-> orange + b).toArray();

        totalApples = Arrays.stream(apples).filter(fruitsInHouse).toArray();
        totalOranges = Arrays.stream(oranges).filter(fruitsInHouse).toArray();

        System.out.println(totalApples.length);
        System.out.println(totalOranges.length);
    }



    public static void main(String[] args) {

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        countApplesAndOranges(s, t, a, b, apples, oranges);


    }
}
