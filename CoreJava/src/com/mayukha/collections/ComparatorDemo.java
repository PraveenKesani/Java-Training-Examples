package com.mayukha.collections;

import java.util.*;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }

}

class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Bob", 70000));
        list.add(new Employee(2, "Alice", 50000));
        list.add(new Employee(3, "Charlie", 60000));
        list.add(new Employee(5, "Charlie", 50000));
        list.add(new Employee(4, "Charlie", 50000));

        // Sort by salary
        /*Comparator<Employee> bySalary = Comparator.comparingDouble(e -> e.salary);
        Collections.sort(list, bySalary);*/
        Comparator<Employee> bySalary = Comparator.comparingDouble(Employee::getSalary);
        list.sort(bySalary);
        System.out.println("Sorted by Salary: " + list);




        // Sort by name
        Comparator<Employee> byName = Comparator.comparing(e -> e.name);
        Collections.sort(list, byName);
        /*Comparator<Employee> byName = Comparator.comparing(Employee::getName);
        list.sort(byName);*/
        System.out.println("Sorted by name: " + list);

        //Sort by Id
        Comparator<Employee> byId = Comparator.comparingInt(e -> e.id);
        Collections.sort(list, byId);
        /*Comparator<Employee> byId = Comparator.comparingInt(Employee::getId);
        list.sort(byId);*/
        System.out.println("Sorted by ID: " + list);


        // Multi-level: Salary, then Name
        /*Comparator<Employee> comparator = Comparator.comparingDouble(Employee::getSalary)
                .thenComparing(Employee::getName).thenComparing(Employee::getId);
        Collections.sort(list, comparator);*/
        Collections.sort(list, bySalary.thenComparing(byName).thenComparing(byId));
        /*list.sort(bySalary.thenComparing(byName));*/
        System.out.println("Sorted by Salary, then Name: " + list);
    }
}

