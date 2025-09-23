package com.mayukha.java8features;

import java.util.*;

public class MethodRefDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Praveen", "Durga", "Lokesh");

        for(int i=0; i< names.size()-1; i++){
            System.out.println(names.get(i));
        }

        // Lambda
        names.forEach(n -> System.out.println(n + " Welcome to the world."));

        // Method Reference
        names.forEach(System.out::println);



    }
}

