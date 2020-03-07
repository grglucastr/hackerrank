package com.hackerrank.catsandamouse;

public class CatsAndAMouse {

    public String query(int posCatA, int posCatB, int posMouse) {
        int distanceAC = posCatA - posMouse;
        if(distanceAC < 0 ) {
            distanceAC *= -1;
        }

        int distanceBC = posCatB - posMouse;

        if(distanceBC < 0 ) {
            distanceBC *= -1;
        }

        if(distanceAC == distanceBC){
            return "Mouse C";
        }else if(distanceAC < distanceBC){
            return "Cat A";
        }else{
            return "Cat B";
        }
    }
}
