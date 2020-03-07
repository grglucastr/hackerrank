package com.hackerrank.electronicsshop;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ElectronicsShop {
    public int calculateMaximumToAfford(int k[], int[] d, int budget) {

        List<Integer> keyboards = Arrays.stream(k).boxed().collect(Collectors.toList());
        List<Integer> drivers = Arrays.stream(d).boxed().collect(Collectors.toList());

        //1) Analyze all arrays and check the majors. i.e. Sort the array
        ToIntFunction<Integer> sortHelper = i -> i;
        Collections.sort(keyboards, Comparator.comparingInt(sortHelper).reversed());
        Collections.sort(drivers, Comparator.comparingInt(sortHelper).reversed());

        List<Integer> lst1;
        List<Integer> lst2;

        lst1 = keyboards;
        lst2 = drivers;

        if(drivers.size() > keyboards.size()){
            lst1 = drivers;
            lst2 = keyboards;
        }

        int maximum = -1;

        //2) Sum the max values of each array in order to find the maximum she can afford
        for(Integer item1 : lst1){
            for(Integer item2 : lst2){

                int sum = item1 + item2;
                if(sum > budget) {
                    continue;
                }

                if(sum > maximum){
                    maximum = sum;
                }
            }
        }


        return maximum;
    }
}
