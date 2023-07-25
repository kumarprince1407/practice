package com.bridgelabz.classwork;
import java.util.*;
//Write a Java program to iterate through all elements in an array list
public class Arrays1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);


        Iterator<Integer> iterator = arrayList1.iterator();


        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element+" ");
        }
    }
}
