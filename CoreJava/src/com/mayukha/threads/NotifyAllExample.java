package com.mayukha.threads;

class SharedObject {
    private boolean available = false;

    public synchronized void work(String name) {
        while (!available) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(name + " got notified!");
    }

    public synchronized void signalAll() {
        available = true;
        notifyAll();
    }
}

public class NotifyAllExample {
    public static void main(String[] args) throws InterruptedException {
        SharedObject obj = new SharedObject();

        Runnable r = () -> obj.work(Thread.currentThread().getName());

        Thread t1 = new Thread(r, "Thread-1");
        Thread t2 = new Thread(r, "Thread-2");
        Thread t3 = new Thread(r, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);
        obj.signalAll();
    }
}
