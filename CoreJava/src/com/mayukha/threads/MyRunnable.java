package com.mayukha.threads;

class MyDemo123 implements Runnable {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

class ThreadExample2 {
    public static void main(String[] args) {
        MyDemo123 mr1 = new MyDemo123();
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr1, "Worker-2");


        t1.start();
        t2.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
