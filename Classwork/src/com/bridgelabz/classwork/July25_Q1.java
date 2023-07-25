package com.bridgelabz.classwork;
//Q1-Convert HashSet to ArrayList in java
import java.util.*;
public class July25_Q1 {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(11);
        hset.add(12);
        hset.add(13);
        hset.add(14);
        hset.add(15);
        System.out.println("Hash Set: ");
        System.out.println(hset);

        ArrayList<Integer> arrayList1 = new ArrayList<>(hset);
        System.out.println("Arraylist: ");
        System.out.println(arrayList1);

    }
}
