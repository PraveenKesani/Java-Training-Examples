package com.mayukha.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMapDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Charlie", 70000)
        );

        //employees.stream().filter(e -> e.getLocation().equals('Hyd')).map(e -> e.getName()).collect(Collectors.toSet());

        Map<Integer, Employee> map = employees.stream()
                .collect(Collectors.toMap(Employee::getId, e -> e));

        Map<Integer, String> map2 = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(map);

        System.out.println(map2);


        List<Employee> employeess = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Alice", 70000) // duplicate key
        );

        Map<String, Double> map3 = employeess.stream()
                .collect(Collectors.toMap(Employee::getName,
                        Employee::getSalary,
                        (s1, s2) -> Math.max(s1, s2))); // keep highest salary

        System.out.println(map3);

        List<Integer> numbers = Arrays.asList(10,15,8,9,15,22,10,22,10,8,9,8,9,8);

        for(int i=0; i<10;i++){
            System.out.println(numbers.get(i));
        }

        numbers.stream().forEach(System.out::println);

        System.out.println(numbers.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum)));






    }
}
