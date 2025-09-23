package com.mayukha.java8features;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Before Java 8
        Collections.sort(names, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // Java 8 Lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted: " + names);
    }
}
