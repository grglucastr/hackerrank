package com.hackerrank.letters;

public class Main {
    public static String solution(int A, int B) {
        // write your code in Java SE 8
        int totalLetters = A + B;
        int qtyA = A;
        int qtyB = B;

        String word = "";

        if(A > B){

            for (int i = 0; i < totalLetters; i++){
                if(i % 2 == 0){
                    if(qtyB > 0){
                        word += "b";
                        qtyB--;
                    }else if(qtyA >= 2){
                        word += "aa";
                        qtyA -=2;
                    }else if(qtyA >= 1){
                        word += "a";
                        qtyA -=1;
                    }

                }else{
                    if(qtyA >= 2){
                        word += "aa";
                        qtyA -= 2;
                    }else if(qtyA >= 1){
                        word += "a";
                        qtyA -=1;
                    }else if(qtyB > 0){
                        word += "b";
                        qtyB--;
                    }
                }
            }

        }else{

            for (int i = 0; i < totalLetters; i++){
                if(i % 2 == 0){
                    if(qtyA > 0){
                        word += "a";
                        qtyA--;
                    }else if(qtyB >= 2){
                        word += "bb";
                        qtyB -=2;
                    }else if(qtyB >= 1){
                        word += "b";
                        qtyB -=1;
                    }

                }else{
                    if(qtyB >= 2){
                        word += "bb";
                        qtyB -= 2;
                    }else if(qtyB >= 1){
                        word += "b";
                        qtyB -=1;
                    }else if(qtyA > 0){
                        word += "a";
                        qtyA--;
                    }
                }
            }
        }


        return word;

    }


    public static void main(String[] args) {

        int A = 1;
        int B = 4;

        String result = solution(A,B);


        System.out.println("result --->" + result);

    }

}
