package com.bridgelabz.classwork;
import java.util.*;
/*
Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
 and print their name and age.
 */
 class Person{
     String name;
     int age;
}


public class PesronClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age=24;
        p1.name="xyz";
        p2.age=35;
        p2.name="pqrs";
        System.out.println("For person P1 - Name: "+p1.name+" Age: "+ p1.age);
        System.out.println("For person P2 - Name: "+p2.name+" Age: "+ p2.age);
    }
}
