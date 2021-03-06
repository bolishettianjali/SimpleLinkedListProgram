package com.linkedList;

public class SimpleLinkedList {

    /**
     * These variables are used to hold first and last
     * initialised Node objects.
     */
    Node head, tail;
    private int size;

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
                    size++;
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
            System.out.println("List is empty.");
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

    /**
     * This method is used to insert the data after the specified element in list.
     *
     * @param data
     * @param dataToBeAdd
     */
    public void insertAfter(int data, int dataToBeAdd) {
        Node node = head;
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else if (!contains(data)) {
            System.out.println("No Matches found");
        } else {
            for (int i = 0; i < size; i++) {
                if (data == node.data) {
                    insertAt(i + 1, dataToBeAdd);
                }
                node = node.nextNode;
            }
        }
    }

    /**
     * This method removes the specified element from the list.
     *
     * @param data
     */
    public void remove(int data) {
        Node node = head;
        Node prevNode = head;
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else if (!contains(data)) {
            System.out.println("No Matches found");
        } else if (head.data == data) {
            pop();
        } else {
            while (node != null) {
                if (node.data == data) {
                    prevNode.nextNode = node.nextNode;
                    size--;
                    break;
                }
                prevNode = node;
                node = node.nextNode;
            }
        }
    }

    /**
     * This method will return true if list is empty or else false.
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * this method is to return size of the LinkedList.
     *
     * @return
     */
    public int size() {
        return size;
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