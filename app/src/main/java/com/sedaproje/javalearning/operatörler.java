package com.sedaproje.javalearning;

import android.widget.Switch;

import java.sql.SQLOutput;

public class operatörler {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println("x:" + x);
        int y = 4;
        System.out.println("y:" + y);
        System.out.println("x>y:" + (x > y));
        System.out.println("x<y:" + (x < y));
        // y değerini x değerine atar

        System.out.println(x == y);
        System.out.println(y != x);
        System.out.println(x >= y);
        // ve &&
        //veya ||
        //if flows
        if (x > y) {
            System.out.println("x büyük");
        } else if (x < y) {
            System.out.println("x küçük");
        } else {
            System.out.println("x eşit y");
        }
        //switch
        int day = 4;
        String daystring = "";
        switch (day) {
            case 1:
                daystring="monday";
                break;
            case 2:
                daystring="tuesday";
                break;
            case 3:
                daystring="wednesday";
                break;
                default:
                    daystring="sunday";
                    break;
        }
        System.out.println(daystring);

    }
}