package com.mayukha.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("file.txt"); // file may not exist
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
        /*try {
            FileReader fr = new FileReader("file.txt"); // file may not exist
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }*/
    }
}
