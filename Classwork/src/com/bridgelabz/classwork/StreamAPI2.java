package com.bridgelabz.classwork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;

public class StreamAPI2 {
    public static void main(String[] args) {
        //Part I: Intermediate Operations

        // create a list of integers
        List<Integer> number= Arrays.asList(2,3,4,5);

        //demonstration of map method
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        //Create a list of string
        List<String> names= Arrays.asList("Reflection","Collection","Stream");

        //demonstration of filter method
        List <String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        //demonstration of sorted method
        List<String> sortedResult=names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedResult);

        //part II: Terminal Operations

        //creating a list
        List<Integer>number2=Arrays.asList(2,3,4,5);

        //Collect method to return a set
        Set<Integer> squareSet =number2.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        //demonstration of forEach method
        number2.stream().map(x->x*x).forEach(y-> System.out.println(y));

        //demonstration of reduce method
        int even = number2.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+1);
        System.out.println(even);
    }
}
