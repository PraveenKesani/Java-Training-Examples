package com.mayukha.exceptionhandling;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Runtime exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e.getMessage());
        }
    }
}
