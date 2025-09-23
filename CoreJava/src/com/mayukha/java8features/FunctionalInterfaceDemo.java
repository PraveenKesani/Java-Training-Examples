package com.mayukha.java8features;

@FunctionalInterface
interface Greeting {
    void sayHello(String fname, int lname);
}

/*class Demo implements Greeting{

    @Override
    public void sayHello(String fn, int ln) {
        System.out.println("Hello, " + fn);
        System.out.println("Hello" + ln);
        System.out.println("Hello");
    }
}*/


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting g = (fn, ln) -> {
            System.out.println("Hello, " + fn);
            System.out.println("Hello" + ln);
            System.out.println("Hello");
        };
        g.sayHello("Durga", 10);
    }
}

