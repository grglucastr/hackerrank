package com.hackerrank.catsandamouse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CatsAndAMouseTest {

    private CatsAndAMouse catsAndAMouse;
    //private ByteArrayOutputStream outputStream;


    @BeforeEach
    public void setUp() {
        catsAndAMouse = new CatsAndAMouse();
        //outputStream = new ByteArrayOutputStream();
        //System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testCatBCatchesTheMouse(){
        int posCatA = 1;
        int posCatB = 2;
        int posMouse = 3;

        String result = catsAndAMouse.query(posCatA, posCatB, posMouse);
        assertEquals("Cat B", result);
    }

    @Test
    public void testCatACatchesTheMouse(){
        int posCatA = 2;
        int posCatB = 1;
        int posMouse = 3;

        String result = catsAndAMouse.query(posCatA, posCatB, posMouse);
        assertEquals("Cat A", result);
    }

    @Test
    public void testCatsGonnaFight(){
        int posCatA = 1;
        int posCatB = 3;
        int posMouse = 2;

        String result = catsAndAMouse.query(posCatA, posCatB, posMouse);
        assertEquals("Mouse C", result);
    }

}