package com.mayukha.java8features;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
    static void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car implements Vehicle {}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // default method
        Vehicle.stop(); // static method
    }
}

