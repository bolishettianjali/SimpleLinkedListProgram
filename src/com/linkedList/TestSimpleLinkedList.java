package com.linkedList;

public class TestSimpleLinkedList {

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.display();
        list.insertAfter(20, 30);
        System.out.println();
        list.display();
    }
}
