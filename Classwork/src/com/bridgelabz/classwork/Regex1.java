package com.bridgelabz.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        //Pattern
        System.out.println(Pattern.matches("geeksforge*ks","geeksforgeeks"));//true

        System.out.println(Pattern.matches("geek*geek","geeksforgeeks"));//false

        //Matcher
        Pattern pattern =Pattern.compile("geeks");//Create a pattern to be searched
        //Search the above pattern in a given text
        Matcher matcher =pattern.matcher("geeksforgeeks.org");
        //Finding the string using find() method
        while(matcher.find()){
            System.out.println("Pattern found from "+matcher.start()+" to "+ (matcher.end()-1));
        }

        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]","g"));
        // Check if the element is range a to z or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]","Gfg"));


        // Checking all the strings using regex
        System.out.println(Pattern.matches("[b-z]?", "a"));
        System.out.println(Pattern.matches("[b-z]","k"));
        // Check if all the elements are in range a to z
        // or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]+", "GfgTestCase"));//true
        System.out.println(Pattern.matches("[a-pA-P]+","GfgTestCase"));//false
        // Check if elements is not in range a to z
        System.out.println(Pattern.matches("[^a-z]?", "g"));//false
        System.out.println(Pattern.matches("[^a-p]?","z"));//true
        System.out.println();
    }
}
