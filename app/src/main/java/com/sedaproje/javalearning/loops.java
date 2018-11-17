package com.sedaproje.javalearning;

public class loops {
    public static void main(String[] args) {
        //for loop
        int[] mynumber = {12, 15, 18, 21, 24};
        int x = mynumber[0] / 3 * 5;
        System.out.println(x);
       for (int i=0;i<mynumber.length;i++) {
           int y = mynumber[i] / 3 * 5;
           System.out.println(y);
       }
        System.out.println(" ");
           for (int number:mynumber){
               int z=number/3*5;
               System.out.println(z);
       }
       //while loops
        System.out.println("");
        int j=0;
           while(j<10){
               int z=j*10;
               System.out.println(z);
               j++;
           }
    }
}

