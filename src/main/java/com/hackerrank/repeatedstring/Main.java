package com.hackerrank.repeatedstring;

public class Main {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        if(s.length() == 1 && s.equalsIgnoreCase("a")){
            return n;
        }

        String removeThese = s.replace("a", "");
        long qty = s.length() - removeThese.length();
        long words = n / s.length();
        long rest = n % s.length();

        qty *= words;

        for (int i = 0; i < rest; i++) {
            if(s.charAt(i)=='a'){
                qty++;
            }

        }

        return qty;

    }

    public static void main(String[] args) {

        String s = "cfimaakj";
        long n = 554045874191l;

        // abc abc abc a // 4

        long qtyA = repeatedString(s, n);

        System.out.println("qty a  ---->  " + qtyA);


    }
}
