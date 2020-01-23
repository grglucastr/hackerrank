package com.hackerrank.smssplit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int solution(String S, int K) {
        // write your code in Java SE 8

        if(S.equalsIgnoreCase("")){
            return -1;
        }

        if(S.length() > 500){
            return -1;
        }


        String[] words = S.split(" ");
        List<String> messages = new ArrayList<>();

        String message = "";

        for(int i = 0; i < words.length; i++){
            String word = words[i].trim();

            String tmp = message;
            tmp += word;

            if (tmp.length() > K){

                messages.add(message.trim());
                message = word;
                message += " ";

            }else{
                message += word;
                message += " ";
            }

            if(i == (words.length -1) && !message.equalsIgnoreCase("")){
                messages.add(message);
            }
        }

        return messages.size();
    }


    public static void main(String[] args) {

        String msg = "  Lorem    ipsum dolor    sit amet, consectetur    adipiscing elit. Quisque tempor tellus";
        int k = 20;


        int result = solution(msg, k);

        System.out.println("Result --->" +
                result);


    }
}
