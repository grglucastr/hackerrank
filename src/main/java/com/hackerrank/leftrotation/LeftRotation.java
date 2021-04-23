package com.hackerrank.leftrotation;

import java.util.Arrays;
public class LeftRotation {

    public int[] rotateLeft(int[] a, int d){

        int[] tmpArr = Arrays.copyOfRange(a, 0, d);
        int[] newArr = new int[a.length];

        int auxIdx = 0;

        for (int i = d; i < a.length; i++) {
            newArr[auxIdx] = a[i];
            auxIdx++;
        }

        for (int i = 0; i < tmpArr.length; i++) {
            newArr[auxIdx] = tmpArr[i];
            auxIdx++;
        }

        return newArr;
    }

}
