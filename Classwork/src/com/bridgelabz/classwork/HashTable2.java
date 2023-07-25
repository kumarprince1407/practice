package com.bridgelabz.classwork;

import java.util.ArrayList;
import java.util.Hashtable;

 class Hashtable2 <K,V>{

    Integer bucketSize;
    ArrayList bucketList;

    public Hashtable2() {
        this.bucketSize = 10;
        this.bucketList = new ArrayList<>(bucketSize);
    }

    public Integer getIndex(K key) {
        Integer index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }
}


