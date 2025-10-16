package com.mayukha.threads;

class PingPong {
    private boolean isPingTurn = true;

    public synchronized void ping() {
        for (int i = 0; i < 5; i++) {
            while (!isPingTurn) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println("Ping");
            isPingTurn = false;
            notify();
        }
    }

    public synchronized void pong() {
        for (int i = 0; i < 5; i++) {
            while (isPingTurn) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println("Pong");
            isPingTurn = true;
            notify();
        }
    }
}

class ThreadCommunicationDemo {
    public static void main(String[] args) {
        PingPong pp = new PingPong();

        Thread t1 = new Thread(() -> pp.ping());
        Thread t2 = new Thread(() -> pp.pong());

        t1.start();
        t2.start();
    }
}

