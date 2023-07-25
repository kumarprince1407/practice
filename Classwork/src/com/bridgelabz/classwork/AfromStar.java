package com.bridgelabz.classwork;
//A from star
import java.util.*;
public class AfromStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value on n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){
            //left side spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i*2 - 1;k++){
                if(k==1 || k==i*2 - 1 || i==(n+1)/2){
                    System.out.print("*");//Print *
                }else{
                    System.out.print(" ");//spaces between *
                }

            }

            System.out.println();
        }
    }
}
