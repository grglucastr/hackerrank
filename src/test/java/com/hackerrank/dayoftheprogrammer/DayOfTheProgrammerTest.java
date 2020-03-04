package com.hackerrank.dayoftheprogrammer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfTheProgrammerTest {

    private DayOfTheProgrammer dayOfTheProgrammer;

    @BeforeEach
    public void setUp() {
        dayOfTheProgrammer = new DayOfTheProgrammer();
    }

    @Test
    public void testDayOfTheProgrammerForYear2017(){
        int year = 2017;
        String day = dayOfTheProgrammer.get(year);
        String expected = "13.09."+year;
        assertEquals(expected, day);

    }

    @Test
    public void testDayOfTheProgrammerForYear2047(){
        int year = 2047;
        String day = dayOfTheProgrammer.get(year);
        String expected = "13.09."+year;
        assertEquals(expected, day);
    }

    @Test
    public void testDayOfTheProgrammerForLeapYear2016(){
        int year = 2016;
        String day = dayOfTheProgrammer.get(year);
        String expected = "12.09."+year;
        assertEquals(expected, day);
    }

    @Test
    public void testDayOfTheProgrammerForLeapYear1800(){
        int year = 1800;
        String day = dayOfTheProgrammer.get(year);
        String expected = "12.09."+year;
        assertEquals(expected, day);
    }

    @Test
    public void testDayOfTheProgrammerForLeapYear1801(){
        int year = 1801;
        String day = dayOfTheProgrammer.get(year);
        String expected = "13.09."+year;
        assertEquals(expected, day);
    }

    @Test
    public void testDayOfTheProgrammerForLeapYear2048(){
        int year = 2048;
        String day = dayOfTheProgrammer.get(year);
        String expected = "12.09."+year;
        assertEquals(expected, day);
    }

    @Test
    public void testDayOfTheProgrammerForLeapYear2107(){
        int year = 2107;
        String day = dayOfTheProgrammer.get(year);
        String expected = "13.09."+year;
        assertEquals(expected, day);
    }

    @Test
    public void testDayOfTheProgrammerForYear1918(){
        int year = 1918;
        String day = dayOfTheProgrammer.get(year);
        String expected = "26.09."+year;
        assertEquals(expected, day);
    }
}