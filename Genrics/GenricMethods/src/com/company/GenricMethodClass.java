package com.company;

public class GenricMethodClass {
    public static <T > void printArray(T a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
}
