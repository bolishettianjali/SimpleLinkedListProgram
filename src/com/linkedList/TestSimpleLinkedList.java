package com.linkedList;

import java.util.LinkedList;

public class TestSimpleLinkedList {

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(100);
        list.display();
        System.out.println();
        list.pop();
        list.insertAt(0,100);
        list.display();
    }
}
