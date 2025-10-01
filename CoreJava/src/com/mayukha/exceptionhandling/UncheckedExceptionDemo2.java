package com.mayukha.exceptionhandling;

public class UncheckedExceptionDemo2 {
    public static void main(String[] args) {
        try {
            String str = null;
            if(str == null){
                throw new RuntimeException();
            }
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " + e.getMessage());
        }
    }
}


