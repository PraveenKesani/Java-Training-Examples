package com.mayukha.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student1 st1 = new Student1(1001,"ABC", "California");
        Student1 st2 = new Student1(1002, "DEF", "California");
        Student1 st3 = new Student1(1003, "GHI", "California");

        List<Student1> calList = new ArrayList<>();
        calList.add(st1);
        calList.add(st2);
        calList.add(st3);

        String str1  = st1.getName();
        String str2  = "ABC";

        System.out.println(calList);

        System.out.println(st1.getClass());

        Student1 st4 = new Student1(2001,"ABC", "New Jercy");
        Student1 st5 = new Student1(2002, "DEF", "New Jercy");
        Student1 st6 = new Student1(2003, "GHI", "New Jercy");

        Student1 st61 = new Student1(2003, "GHI", "New Jercy");

        Student1 st62 = (Student1) st61.clone();
        st61.setName("Xyz");
        //save(st61);
        Student1 st64 = new Student1(st61);

        Student1 st65 = new Student1(st61.getId(), st61.getName(), st61.getLocation());



        Student1 st63 = st61;
        st63.setName("Test");

        st6.equals(st61);
        /*String str1 = "abc";

        String str2 = "abc";

        .equals(),  ==*/


        List<Student1> newJList = new ArrayList<>();
        newJList.add(st4);
        newJList.add(st5);
        newJList.add(st6);

        Student1 st7 = new Student1(3001,"ABC", "Atlanta");
        Student1 st8 = new Student1(3002, "DEF", "Atlanta");
        Student1 st9 = new Student1(3003, "GHI", "Atlanta");

        List<Student1> alList = new ArrayList<>();
        alList.add(st7);
        alList.add(st8);
        alList.add(st9);

        Map<String, List<Student1> > usaData = new HashMap();
        usaData.put("California", calList);
        usaData.put("New Jercy", newJList);
        usaData.put("Atlanta", alList);

        Map<String, Map<String, List<Student1>>> map = new HashMap();

        System.out.println(usaData.keySet());

        System.out.println(usaData.containsKey("Atlanta"));

        System.out.println(usaData.get("Atlanta"));
        /*for(Student st : usaData.get("Atlanta")){
            System.out.println(st.getId() +" : "+ st.getName() + " : "+ st.getLocation());
        }*/

        for(String key : usaData.keySet()){
            for(Student1 st : usaData.get(key)){
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

class Student1 implements Cloneable{
    int id;
    String Name;
    String location;

    public Student1(){
    }

    public Student1(int id, String name, String location) {
        this.id = id;
        this.Name = name;
        this.location = location;
    }

    public Student1(Student1 st){
        this.id = st.getId();
        this.Name = st.getName();
        this.location = st.getLocation();

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

    @Override
    public String toString(){
        return getId() +":"+getName()+":"+getLocation();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
