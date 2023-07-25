package com.bridgelabz.classwork;
import java.util.*;
import java.util.ArrayList;

public class StudentData {
    private String name;
    private int marks;

    private char gender;
    public StudentData(String name, int marks, char gender){
        this.name=name;
        this.marks=marks;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public char getGender(){
        return gender;
    }

    public static void main(String[] args) {
        StudentData s1 = new StudentData("Adam", 98, 'M');
        StudentData s2 = new StudentData("Mike", 99,'M');
        StudentData s3 = new StudentData("Alice", 97, 'F');

        List<StudentData> list =new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(StudentData stud : list){
            System.out.println("Name: "+stud.getName()+"| Marks: "+stud.getMarks()+"| Gender: "+ stud.getGender());
        }


    }
}
