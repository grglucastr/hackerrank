package com.hackerrank.letters2;

public class Main {

    public static String solution(int A, int B) {
        // write your code in Java SE 8

        int totalLetters = A + B;
        int qtyA = A;
        int qtyB = B;
        String word = "";
        String charsA = "";
        String charsB = "";

        for (int i = 0; i < A; i++) {
            charsA += "a";
        }

        for (int i = 0; i < B; i++) {
            charsB += "b";
        }


        if(A == B){
            for (int i = 0; i < totalLetters; i++) {
                if(i%2==0){
                    word+="a";
                }else{
                    word+="b";
                }
            }
            return word;
        }


        if(A > B){
            for (int i = 0; i < charsA.length(); i++) {

                if(word.length() >= 2){
                    String lastTwoChars = word.substring(word.length() - 2);
                    if(lastTwoChars.equalsIgnoreCase("aa")){

                        if((A-B) == 1){
                            if(qtyB > 0){
                                word += "bba";
                                qtyB-=2;
                            }
                        }else{
                            if(qtyB > 0){
                                word += "ba";
                                qtyB--;
                            }else{
                                word += "a";
                            }
                        }

                    }else if(lastTwoChars.equalsIgnoreCase("ab") ||
                            lastTwoChars.equalsIgnoreCase("ba")){
                        word += "a";
                    }
                }else{
                    word += "a";
                }
            }

            for (int i = 0; i < qtyB; i++) {
                word+="b";
            }

        }else{
            for (int i = 0; i < charsB.length(); i++) {
                if(word.length() >= 2){
                    String lastTwoChars = word.substring(word.length() - 2);
                    if(lastTwoChars.equalsIgnoreCase("bb")){

                        if(B - A == 1){
                            if(qtyA > 0){
                                word += "aab";
                                qtyA-=2;
                            }
                        }else{
                            if(qtyA > 0){
                                word += "ab";
                                qtyA--;
                            }else{
                                word += "b";
                            }
                        }

                    }else if(lastTwoChars.equalsIgnoreCase("ab") ||
                            lastTwoChars.equalsIgnoreCase("ba")){
                        word += "b";
                    }
                }else{
                    word += "b";
                }
            }

            for (int i = 0; i < qtyA; i++) {
                word+="a";

            }
        }

        return word;
    }


    public static void main(String[] args) {

        int A = 5;
        int B = 3;

        String result = solution(A,B);


        System.out.println("result --->" + result);

    }

}
