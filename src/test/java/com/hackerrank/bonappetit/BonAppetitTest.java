package com.hackerrank.bonappetit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BonAppetitTest {

    private BonAppetit bonAppetit;

    @BeforeEach
    public void setUp() {
        bonAppetit = new BonAppetit();
    }

    @Test
    public void testSimpleUnequalBillSplit(){
        List<Integer> list = Arrays.asList(2, 4, 6);
        int excludeIndex = 2;
        int annaContribution = 6;

        String difference = bonAppetit.calculateBillSplit(list, excludeIndex, annaContribution);
        assertEquals("3", difference);

    }

    @Test
    public void testUnequalBillSplit(){
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        int excludeIndex = 1;
        int annaContribution = 12;

        String difference = bonAppetit.calculateBillSplit(list, excludeIndex, annaContribution);
        assertEquals("5", difference);

    }

    @Test
    public void testEqualBillSplit(){
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        int excludeIndex = 1;
        int annaContribution = 7;

        String difference = bonAppetit.calculateBillSplit(list, excludeIndex, annaContribution);
        assertEquals("Bon Appetit", difference);
    }
}