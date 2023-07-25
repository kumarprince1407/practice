package com.bridgelabz.classwork;

import java.util.ArrayList;

//Q4-Convert ArrayList to String Array
public class July25_Q4 {
    public static void main(String[] args) {
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("apple");
        arrayList2.add("orange");
        arrayList2.add("banana");
        arrayList2.add("pineapple");
        arrayList2.add("mango");
        System.out.println("Fruit array list: "+arrayList2);

        String[]fruitArray= new String[arrayList2.size()];
        for (int i=0; i<arrayList2.size();i++){
            fruitArray[i]=arrayList2.get(i);
        }
        System.out.println("Fruit array: ");
        for (int i=0; i<fruitArray.length-1 ;i++) {
            System.out.print(fruitArray[i]+ ", ");
        }
        System.out.println(fruitArray[fruitArray.length-1]);
    }
}
