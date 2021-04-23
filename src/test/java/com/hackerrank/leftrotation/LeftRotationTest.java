package com.hackerrank.leftrotation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeftRotationTest {

    private LeftRotation leftRotation;

    @BeforeEach
    void setUp() {
        leftRotation = new LeftRotation();
    }

    @Test
    public void testRotateLeftWithTwoShift(){
        final int shifts = 2;
        int[] arr = {1,2,3,4,5};

        final int[] expectedArr = {3,4,5,1,2};
        final int[] resultArr = leftRotation.rotateLeft(arr, shifts);

        assertArrayEquals(expectedArr, resultArr);
    }

    @Test
    public void testRotateLeftWithFourShift(){
        final int shifts = 4;
        int[] arr = {1,2,3,4,5};

        final int[] expectedArr = {5,1,2,3,4};
        final int[] resultArr = leftRotation.rotateLeft(arr, shifts);

        assertArrayEquals(expectedArr, resultArr);
    }


}