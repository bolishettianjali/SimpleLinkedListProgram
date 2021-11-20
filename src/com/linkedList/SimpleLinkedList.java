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
     * @param data
     */
    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            tail.nextNode = node;
        }
        tail = node;
    }

    /**
     * Method is used to add Node object at first.
     * @param data
     */
    public void addFirst(int data) {
        Node node = new Node(data);

        if (head != null) {
            node.nextNode = head;
        }
        head = node;
    }

    /**
     * Method to display all the data in Node objects
     */
    public void display() {
        Node node = head;
        if(head == null) {
            System.out.println("List is Empty");
        } else {
            while (node != null) {
                System.out.println(node.data);
                node = node.nextNode;
            }
        }
    }
}