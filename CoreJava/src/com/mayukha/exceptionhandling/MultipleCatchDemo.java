package com.mayukha.exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String s = "";//getStringObject();
            System.out.println(s.toLowerCase()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
