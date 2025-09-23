package com.mayukha.java8features;

import java.util.*;
import java.util.stream.*;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Praveen", "Durga", "Lokesh", "Ramesh");

        // Convert to Set (remove duplicates)
        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        System.out.println(nameSet);

        // Grouping by length
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
