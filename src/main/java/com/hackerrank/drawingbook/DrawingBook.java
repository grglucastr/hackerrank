package com.hackerrank.drawingbook;

public class DrawingBook {


    public int getMinimumNumberPage(int totalOfPages, int openInPage) {
        float middle = totalOfPages / 2.0f;
        int minimum = 0;

        if(openInPage >  middle){
            int startFromEnd = (totalOfPages-1); //Because the book is already opened on last page.
            if(totalOfPages % 2 == 0){
                startFromEnd = totalOfPages;
            }

            for (int i = startFromEnd; i > openInPage; i-=2) {
                minimum++;
            }
            return minimum;
        }

        for (int i = 1; i < openInPage; i+=2){
            minimum++;
        }
        return minimum;
    }


}
