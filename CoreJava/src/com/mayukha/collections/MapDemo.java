package com.mayukha.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Student st1 = new Student(1001,"ABC", "California");
        Student st2 = new Student(1002, "DEF", "California");
        Student st3 = new Student(1003, "GHI", "California");

        List<Student> calList = new ArrayList<>();
        calList.add(st1);
        calList.add(st2);
        calList.add(st3);

        Student st4 = new Student(2001,"ABC", "New Jercy");
        Student st5 = new Student(2002, "DEF", "New Jercy");
        Student st6 = new Student(2003, "GHI", "New Jercy");

        List<Student> newJList = new ArrayList<>();
        newJList.add(st4);
        newJList.add(st5);
        newJList.add(st6);

        Student st7 = new Student(3001,"ABC", "Atlanta");
        Student st8 = new Student(3002, "DEF", "Atlanta");
        Student st9 = new Student(3003, "GHI", "Atlanta");

        List<Student> alList = new ArrayList<>();
        alList.add(st7);
        alList.add(st8);
        alList.add(st9);

        Map<String, List<Student> > usaData = new HashMap();
        usaData.put("California", calList);
        usaData.put("New Jercy", newJList);
        usaData.put("Atlanta", alList);

        Map<String, Map<String, List<Student>>> map = new HashMap();

        System.out.println(usaData.keySet());

        System.out.println(usaData.containsKey("Atlanta"));

        System.out.println(usaData.get("Atlanta"));
        /*for(Student st : usaData.get("Atlanta")){
            System.out.println(st.getId() +" : "+ st.getName() + " : "+ st.getLocation());
        }*/

        for(String key : usaData.keySet()){
            for(Student st : usaData.get(key)){
                System.out.println(st.getId() +" : "+ st.getName() + " : "+ st.getLocation());
            }
            System.out.println("-----------------------");
        }

        Set tempSet = usaData.entrySet();









        /*for( Integer key : usaData.keySet()){
            System.out.println(usaData.get(key));
        }*/

        System.out.println(usaData.containsKey(21));





    }
}

class Student {
    int id;
    String Name;
    String location;

    public Student(int id, String name, String location) {
        this.id = id;
        Name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
