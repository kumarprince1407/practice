package com.bridgelabz.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(7);
        arrayList2.add(8);
        arrayList2.add(3);
        arrayList2.add(4);

       // Iterator<Integer> iterator2 = arrayList2.iterator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to search.");
        int n =sc.nextInt();
        boolean found = arrayList2.contains(n);
        if(found){
            System.out.println("Element found at position: "+arrayList2.indexOf(n));
        }
        else{
            System.out.println("Element not found. ");
        }

    }
}
