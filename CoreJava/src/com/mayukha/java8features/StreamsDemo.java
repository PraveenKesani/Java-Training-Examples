package com.mayukha.java8features;

import java.util.*;
import java.util.stream.*;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        for(int i=0;i< numbers.size()-1;i++) {
            int  num = numbers.get(i);
            if(num % 2 == 0) {
                System.out.println("Square of "+ num +" is : "+num * num);
            }
        }

        int[] arr = {1,2,3,4,5,5};
        Stream.of(arr);

        //Stream.generate(Employee::create).limit(5).collect(Collectors.toList());


        // Filter even numbers, square them, and collect
        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);

        List res = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
        numbers.stream().filter(n -> n % 2 == 0).count();

        /*List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());*/

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println("result :"+ result);

        Boolean bres = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n).anyMatch( n -> n == 100);// [100, 400]
    }

    //Intermediate operations
    //filter()
    //map()
    //sorted()
    //peek()
    //limit()
    //skip()
    //distinct()

    //Terminal Operations
    //forEach
    //collect
    //count
    //match() - anyMatch(), allMatch(), nonMatch()
    //findFirst
}

