package com.mayukha.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList arrList = new ArrayList();

        arrList.add("Welcome");
        arrList.add(1);
        arrList.add(10.5);
        arrList.add('h');

        arrList.add(3, "Durga");

        System.out.println("arrList :"+arrList);

        List<String> list2 = new ArrayList();
        list2.add("A");
        list2.add("B");
        list2.add("C");


        List tempList = new ArrayList();
        for(Object value : arrList){
            tempList.add(String.valueOf(value));
        }

        list2.addAll(2, tempList);

        list2.add(3, "Hi");

        System.out.println("tempList:"+tempList);

        System.out.println("list2:"+list2);

        System.out.println(list2.get(4));

        System.out.println(list2.contains("Durga"));

        System.out.println(list2.containsAll(tempList));






    }
}
