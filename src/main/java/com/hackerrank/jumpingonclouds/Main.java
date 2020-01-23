package com.hackerrank.jumpingonclouds;

public class Main {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {


        int oneCloudIndex = 0, twoCloudsIndex = 0;

        int jump = 0;

        for (int i = 0; i < c.length; i++) {

            twoCloudsIndex = i + 2;
            oneCloudIndex = i + 1;


            if(twoCloudsIndex < c.length ){
                if(c[twoCloudsIndex] == 0){
                    jump++;
                    i += 1;
                }else if(c[oneCloudIndex] == 0){
                    jump++;
                }
            }else{

                if(oneCloudIndex < c.length){
                    if(c[oneCloudIndex] == 0){
                        jump++;
                    }
                }
            }
        }

        return jump;
    }

    public static void main(String[] args) {


        int c[] = {0, 0, 1, 0, 0, 1, 0};
        int d[] = {0, 0, 0, 0, 1, 0};
        int e[] = {0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0};

        int clouds = jumpingOnClouds(e);


        System.out.println("clouds: " + clouds);

    }


}
