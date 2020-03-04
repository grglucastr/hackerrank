package com.hackerrank.migratorybirds;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MigratoryBirdsTest {

    private MigratoryBirds migratoryBirds;

    @BeforeEach
    public void setup(){
        log.info("Setting up...");
        migratoryBirds = new MigratoryBirds();
    }

    @Test
    public void testMustCommonNumber(){
        List<Integer> numbers = Arrays.asList(1, 4, 4, 4, 5, 3);
        int common = migratoryBirds.findCommonOrCommonLowest(numbers);
        assertEquals(4, common);
    }

    @Test
    public void testGetTheSimpleLowestCommonNumber(){
        List<Integer> numbers = Arrays.asList(1,1,2,2,3);
        int common = migratoryBirds.findCommonOrCommonLowest(numbers);
        assertEquals(1, common);
    }

    @Test
    public void testGetTheLowestCommonNumber(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);
        int common = migratoryBirds.findCommonOrCommonLowest(numbers);
        assertEquals(3, common);
    }



}