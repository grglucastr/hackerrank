package com.hackerrank.migratorybirds;

import org.springframework.util.comparator.Comparators;

import java.util.*;

public class MigratoryBirds {

    public int findCommonOrCommonLowest(List<Integer> numbers) {
        int common = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int current  = numbers.get(i);

            if(map.containsKey(current)){
                int newAmount = map.get(current) + 1;
                map.replace(current, newAmount);
            }else{
                map.put(current, 1);
            }
        }


        int commonAmount = -1;
        for (int item : map.keySet()){

            if(map.get(item) > commonAmount){
                commonAmount = map.get(item);
                common = item;

            }else if(map.get(item) == commonAmount){

                if(item < common){
                    common = item;
                }
            }
        }

        return common;
    }
}
