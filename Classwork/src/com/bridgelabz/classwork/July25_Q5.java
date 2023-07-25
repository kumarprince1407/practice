package com.bridgelabz.classwork;
//Q5 Convert Uppercase to Lowercase in java without using built in method
import java.util.*;
public class July25_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a upper case string: ");
        String string1 = sc.nextLine();
        String string2 = string1.toLowerCase();
        System.out.println("Lower case string: "+ string2);
    }
}
