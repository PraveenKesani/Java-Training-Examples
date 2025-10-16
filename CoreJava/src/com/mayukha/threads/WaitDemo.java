package com.mayukha.threads;

class Thread1 extends Thread{
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            //wait(); // releases lock and waits
            notify();
        }
    }

    synchronized void printOdd() throws InterruptedException {
        for (int i = 1; i <= 10; i += 2) {
            notify();
            System.out.println("Odd: " + i);
            wait();
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        MyThread2 t2 = new MyThread2();

        t1.start(); //not started thread, just method execution
        t2.start(); // starts a new thread (calls run internally)
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
