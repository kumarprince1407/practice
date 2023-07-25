package com.bridgelabz.classwork;


public class practice2 {
    public static int firstRepeat(int arr[]){
        int repeatingElement=-1;
       boolean foundRepeating = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    repeatingElement=arr[j];
                    foundRepeating=true;
                    break;
                }
            }
            if(foundRepeating){
                break;
            }
        }
        return repeatingElement;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,3,7,9,6,7,6,2};
        int result = firstRepeat(arr);
        System.out.println(result);
    }
}
