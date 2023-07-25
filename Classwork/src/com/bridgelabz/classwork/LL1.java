package com.bridgelabz.classwork;

public class LL1 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    //Add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //Insert after
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty.");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next !=null){
            lastNode=lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next=null;
    }
    public void print(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node currNode= head;
        while(currNode!=null){
            System.out.print(currNode.data +"-->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst(10);
        list.addFirst(20);
        list.print();
        list.addLast(30);
        list.print();
        list.addFirst(40);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        // Insert after a given node
        Node prevNode = list.head.next;
        list.insertAfter(prevNode, 25);
        list.print();
    }
}
