package com.linkedList;

public class TestSimpleLinkedList {

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);
        list.display();
        System.out.println(list.size());
        list.remove(10);
        list.display();
        System.out.println(list.size());
    }
}
