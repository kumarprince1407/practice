package com.bridgelabz.classwork;

import java.util.Scanner;

public class Queue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //Add
        public static void add(int data){
            if(rear==size-1) {
                System.out.println("Queue is empty.");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int front=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[0];
        }


    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        Queue q1 = new Queue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        while(!q1.isEmpty()){
            System.out.print(q1.peek()+"  ");
            q1.remove();
        }


    }
}
