package com.linkedList;

public class SimpleLinkedList {

    /**
     *These variables are used to hold first and last
     *  initialised Node objects.
     */
    Node head, tail;

    /**
     * Method is to create, initialize and Link the new Node
     * object with previous Node object.
     */
    public void add(int data) {
        Node node = new Node(data);//50

        if (head == null) {
            head = node;
        } else {
            tail.nextNode = node;
        }
        tail = node;
    }

    /**
     * Method to display all the data in Node objects
     */
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }
}