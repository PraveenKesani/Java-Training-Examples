package com.mayukha.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }

    /*public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            Thread thread = new Thread(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });

            thread.start(); // manually start the thread
        }
    }*/
}
