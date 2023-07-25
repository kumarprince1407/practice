package com.bridgelabz.classwork;
import java.util.HashMap;
import java.util.Map;

public class practice1 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 2, 4, 1, 3, 5, 1, 4 };

        //Find max element;
        int maxElement = Integer.MIN_VALUE;
        for(int element : array1){
            if(element>maxElement){
                maxElement=element;
            }
        }
        //System.out.println(maxElement);
        //Create an array to store occurrence count
        int[] countArray = new int[maxElement + 1];
        //Iterate over array and count each element
        for(int element : array1){
            countArray[element]++;
        }
        //Display the count of each element
        for(int i=0;i< countArray.length;i++){
            if(countArray[i]>0)
            System.out.println("Count of element "+i+"occurs"+ countArray[i]+"times");
        }
    }
}