package com.mayukha.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);
        numbers.addLast(40);

        System.out.println("Numbers: " + numbers);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removals: " + numbers);
    }
}
