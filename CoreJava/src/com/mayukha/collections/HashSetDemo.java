package com.mayukha.collections;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate ignored

        System.out.println(set);

        // Iterate with iterator
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("First");
        dq.addLast("Last");

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removals: " + dq);
    }
}
