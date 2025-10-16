package com.mayukha.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileUploader {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<String> files = Arrays.asList("file1.txt", "file2.txt", "file3.txt");

        files.forEach(file ->
                pool.submit(() -> System.out.println("Uploading " + file + " by " + Thread.currentThread().getName()))
        );

        pool.shutdown();
    }
}
