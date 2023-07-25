package com.bridgelabz.classwork;
//Q3-Convert LinkedList to ArrayList
import java.util.*;
public class July25_Q3 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList1 = new LinkedList<>();
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(7);
        linkedList1.add(9);
        System.out.println("Linked list: "+linkedList1);
        ArrayList<Integer>arrayList1 = new ArrayList<>(linkedList1);
        System.out.println("Array list: "+arrayList1);

    }
}
