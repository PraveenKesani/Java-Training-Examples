package com.mayukha.java8features;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numbers.stream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " : " + n));

        System.out.println("--------------");

        numbers.parallelStream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " : " + n));

        System.out.println(IntStream.of(10,15,8,9,25,22).max().getAsInt());
    }
}

