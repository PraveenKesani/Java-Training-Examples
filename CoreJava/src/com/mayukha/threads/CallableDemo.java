package com.mayukha.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Computing...");
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> future = service.submit(task);
        System.out.println("Result: " + future.get()); // waits for result
        service.shutdown();
    }
}
