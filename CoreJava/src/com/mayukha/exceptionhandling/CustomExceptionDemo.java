package com.mayukha.exceptionhandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+");
        }
        if (age > 60) {
            throw new InvalidAgeException("Age must be less than 60");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(61);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
