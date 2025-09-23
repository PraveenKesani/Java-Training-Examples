package com.mayukha.java8features;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numbers.parallelStream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " : " + n));
    }
}

