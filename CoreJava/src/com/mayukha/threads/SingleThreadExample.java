package com.mayukha.threads;

class MyThread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class SingleThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
