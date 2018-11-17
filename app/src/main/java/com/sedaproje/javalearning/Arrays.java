package com.sedaproje.javalearning;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        String[] MyArray = new String[3];
        MyArray[0]="seda";
        MyArray[1]="semih";
        MyArray[2]="sinan";
        System.out.println(MyArray[0]+" "+MyArray[1]+" "+MyArray[2]);

         int[] MyNumberArray={20,30,40,50};
        System.out.println(MyNumberArray[2]);
        //LİST
        ArrayList<String>  Myworld =new ArrayList<String>();
        Myworld.add("sevgi");
        Myworld.add("saygı");
        Myworld.add("dürüstlük");
        System.out.println("Benim dünyam?");
        System.out.println(Myworld.get(0));
        System.out.println(Myworld.get(1));
        System.out.println(Myworld.get(2));
        //SET girilen aynı karakterleri bi tane sayar
        HashSet<String> Myset=new HashSet<String>();
        Myset.add("seda");
        Myset.add("seda");
        Myset.add("semih");
        System.out.println(Myset.size());
        //MAP  key value değerleri
        HashMap<String ,String> Myhashmap = new HashMap<String,String>();
        Myhashmap.put("adı","seda");
        Myhashmap.put("müzik","gitar");
        System.out.println(Myhashmap.get("adı"));

    }
}
