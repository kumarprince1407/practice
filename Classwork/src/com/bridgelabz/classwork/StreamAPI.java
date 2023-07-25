package com.bridgelabz.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> list1=new ArrayList<>();
        for(Integer i: list){
            if(i%2 !=0){
                list1.add(i);
                System.out.println(list1);
            }
        }
List<Integer>list2=list.stream().filter(i ->i%2 !=0).collect(Collectors.toList());
        System.out.println("List 2"+list2);
        List<Integer>list3=list.stream().filter(i ->i%2 !=0).map(i->i*12).collect(Collectors.toList());
        System.out.println("List 3"+list3);

        List<Integer>list4=new ArrayList<>();
        list4.add(33);
        list4.add(23);
        list4.add(11);
        list4.add(77);
        list4.add(8);
        list4.add(43);
       // Collections.sort(list4);
        //System.out.println("Sorted without stream: "+list4);

         List<Integer>list5=list4.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted with stream: "+list5);

    }
}
