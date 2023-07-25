package com.bridgelabz.classwork;
//Q2-Convert Array to ArrayList
import java.util.*;
public class July25_Q2 {
    public static void main(String[] args) {
        int[]arr1={5,6,7,8,9};
        ArrayList<Integer> arrayList1= new ArrayList<>();
        for(int i=-0; i<arr1.length;i++) {
            arrayList1.add(arr1[i]);
        }
        System.out.println(arrayList1);
    }
}
