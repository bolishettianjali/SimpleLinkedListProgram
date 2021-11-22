package com.linkedList;

import java.util.LinkedList;

public class TestSimpleLinkedList {

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.display();
        System.out.println();
        list.insertAt(2, 30);
        list.display();
    }
}
