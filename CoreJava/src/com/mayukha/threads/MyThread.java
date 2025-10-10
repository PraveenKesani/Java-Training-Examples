package com.mayukha.threads;

class MyThread1 extends Thread{
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

class MyThread2 extends Thread{
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

class ThreadExample1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();



        t1.run(); //not started thread, just method execution
        t2.start(); // starts a new thread (calls run internally)
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
