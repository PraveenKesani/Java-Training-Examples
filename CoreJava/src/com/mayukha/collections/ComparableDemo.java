package com.mayukha.collections;
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering: by marks
    @Override
    public int compareTo(Student prev) {
        return this.marks - prev.marks; // ascending order
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "CAlice", 85));
        list.add(new Student(2, "Bob", 95));
        list.add(new Student(3, "ZCharlie", 85));

        Collections.sort(list); // uses compareTo()
        System.out.println("Sorted by marks: " + list);
    }
}

