package com.bridgelabz.classwork;

public class Queue2 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next =null;
        }
    }
    static class Queue{
        //Declaring head and tail initially as null
        static Node head=null;
        static Node tail =null;
        public static boolean isEmpty(){
            return head == null && tail ==null;
        }
        public static void add(int data){
             Node newNode = new Node(data);
             if(tail==null){
                 head=tail=newNode;
                 return;
             }
             tail.next=newNode;
             tail=newNode;
        }
        //Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("The Queue is empty.");
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;


        }
        public int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty.");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q2 = new Queue();
        q2.add(1);
        q2.add(2);
        q2.add(3);
    }

}
