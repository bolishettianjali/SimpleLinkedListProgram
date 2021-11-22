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

        if (isEmpty()) {
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

        if (!isEmpty()) {
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

        if (isEmpty()) {
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
     * This method is to delete the first element in the list
     * It replace the first Node object with second Node object in head.
     */
    public void pop() {
        if (isEmpty()) {
            System.out.println("List is empty, Deletion can't be done");
        } else {
            head = head.nextNode;
            size--;
        }
    }

    /**
     * This method is used to remove the last element in the List.
     */
    public void popLast() {
        Node node = head;

        if (isEmpty()) {
            System.out.println("List is empty, Deletion can't be done");
        } else {
            if (size == 1) {
                head = tail = null;
            } else {
                for (int i = 2; i < size; i++) {
                    node = node.nextNode;
                }
                node.nextNode = null;
                tail = node;
            }
            size--;
        }
    }

    /**
     * This method is used to check weather the specified element is present or not in LinkedList.
     * If element is present then returns true or else returns false.
     *
     * @param data
     * @return
     */
    public boolean contains(int data) {
        Node node = head;
        if (isEmpty()) {
            System.out.println("List is empty, Deletion can't be done");
        } else {
            while (node != null) {
                if (node.data == data) {
                    return true;
                }
                node = node.nextNode;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        return false;
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