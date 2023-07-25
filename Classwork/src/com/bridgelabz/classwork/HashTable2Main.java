package com.bridgelabz.classwork;

public class HashTable2Main {
    public static void main(String[] args) {
        String paragraph= "“Paranoids are not\n" +
                "paranoid because they are paranoid but\n" +
                "because they keep putting themselves\n" +
                "deliberately into paranoid avoidable\n" +
                "situations”";
        String[] splitArray = paragraph.split(" ");
        Hashtable2<String,Integer> hashTable = new Hashtable2<>();
        for (String word:splitArray) {
            System.out.print(word + " => " + word.hashCode());
            Integer index = hashTable.getIndex(word);
            System.out.println(" , Index : "+index);
    }

}
}
