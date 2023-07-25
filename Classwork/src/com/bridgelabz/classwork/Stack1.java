package com.bridgelabz.classwork;

public class Stack1 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public Node head;
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next= head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public void printStack() {
            Node currentNode = head;
            System.out.println("Stack elements:");
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.printStack();
        s.pop();
        System.out.println("Stack after popping the top element");
        s.printStack();
        s.pop();
        System.out.println("Stack after popping the top element");
        s.printStack();
        System.out.println(s.peek());
    }
}
