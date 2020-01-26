package com.hackerrank.birthdaychocolate;

import java.util.List;

public class Main {


    static int birthday(List<Integer> s, int d, int m) {
        int qtyParts = 0;

        for(int i = 0; i < s.size(); i++){

            int limit = (i+m) >= s.size()?s.size():(i+m);

            int sum = s.subList(i, limit).stream().reduce(0, Integer::sum);
            if(sum == d) qtyParts++;
        }

        return qtyParts;

    }

    public static void main(String[] args){

    }

}
