package com.hackerrank.drawingbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrawingBookTest {

    private DrawingBook drawingBook;

    @BeforeEach
    public void setUp() {
        drawingBook = new DrawingBook();
    }

    @Test
    public void testOpenOnPageTwoWhereTheTotalNumberOfPagesIsSix(){

        int totalOfPages = 6;
        int openInPage = 2;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(1, minimumPage);

    }

    @Test
    public void testOpenOnPageFourWhereTheTotalNumberOfPagesIsFive(){
        int totalOfPages = 5;
        int openInPage = 4;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(0, minimumPage);
    }

    @Test
    public void testOpenOnPageFourWhereTheTotalNumberOfPagesIsSix(){
        int totalOfPages = 6;
        int openInPage = 4;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(1, minimumPage);
    }

    @Test
    public void testOpenOnPageThreeWhereTheTotalNumberOfPagesIsSeven(){
        int totalOfPages = 7;
        int openInPage = 3;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(1, minimumPage);
    }

    @Test
    public void testOpenPageTwoWhenTotalNumberOfPagesIsFive(){
        int totalOfPages = 5;
        int openInPage = 2;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(1, minimumPage);
    }

    @Test
    public void testOpenPageFourWhenTotalOfPagesIsSeven(){
        int totalOfPages = 7;
        int openInPage = 4;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(1, minimumPage);
    }

    @Test
    public void testOpenOnPage70030WhenTotalOfPagesIs96993(){
        int totalOfPages = 96993;
        int openInPage = 70030;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(13481, minimumPage);
    }

    @Test
    public void testOpenOnPageFiveWhenTotalOfPagesIsSix(){
        int totalOfPages = 6;
        int openInPage = 5;
        int minimumPage = drawingBook.getMinimumNumberPage(totalOfPages, openInPage);
        assertEquals(1, minimumPage);
    }
}