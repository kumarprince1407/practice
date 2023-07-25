package com.bridgelabz.classwork;

import java.util.ArrayList;
import java.util.List;

public class PersonClass2 {
    private String name;
    private int age;

    public PersonClass2(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        PersonClass2 p1 = new PersonClass2("Prince K", 28);
        PersonClass2 p2 = new PersonClass2("Elon M",30);

        List<PersonClass2> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        for(PersonClass2 person: list){
            System.out.println("Name: "+person.getName() + " Age: "+person.getAge() );
        }


    }
}
