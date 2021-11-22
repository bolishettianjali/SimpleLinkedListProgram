package com.linkedList;

public class SimpleLinkedList {

    /**
     * These variables are used to hold first and last
     * initialised Node objects.
     */
    Node head, tail;
    int size;

    /**
     * Method is to create, initialize and Link the new Node
     * object with previous Node object.
     *
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
        size++;
    }

    /**
     * Method is used to add Node object at first position in LinkedList.
     *
     * @param data
     */
    public void addFirst(int data) {
        Node node = new Node(data);

        if (head != null) {
            node.nextNode = head;
        }
        head = node;
        size++;
    }

    /**
     * This method is used to insert the initialised Node object with data
     * at the specified position.
     *
     * @param index
     * @param data
     */
    public void insertAt(int index, int data) {
        Node temp = head;
        Node prev = temp;
        Node node = new Node(data);

        if (temp == null) {
            System.out.println("List is Empty can't insert data in specified position");
        } else if (index > size || index < 0) {
            System.out.println("Insertion can not be done at specified position: " + index);
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            add(data);
        } else {
            for (int i = 0; i <= size; i++) {
                if (i == index) {
                    node.nextNode = temp;
                    prev.nextNode = node;
                    break;
                }
                prev = temp;
                temp = temp.nextNode;
            }
        }
    }

    /**
     * Method to display all the data in Node objects
     */
    public void display() {
        Node node = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            while (node != null) {
                System.out.println(node.data);
                node = node.nextNode;
            }
        }
    }
}