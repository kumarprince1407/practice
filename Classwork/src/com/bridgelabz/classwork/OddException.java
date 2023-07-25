package com.bridgelabz.classwork;
import java.util.*;
//Write a Java program to create a method that takes an integer
// as a parameter and throws an exception if the number is odd.
public class OddException {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        try {
            if(n%2==0) {
                System.out.println("The entered number is even.");
            }
            //else
               // throw new Exception("The entered number is odd.");
        }
        catch (Exception e){
            //System.out.println(e.getMessage());
            System.out.println("The entered number is odd.");
        }


    }
}
