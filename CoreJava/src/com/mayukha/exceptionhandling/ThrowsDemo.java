package com.mayukha.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt"); // may throw FileNotFoundException
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
