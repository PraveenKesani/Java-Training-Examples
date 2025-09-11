package com.mayukha.encapsulation;

public class Tax {
    public static void main(String args[]){
        Employee emp1 = Employee.getEmployeeObject();
        System.out.println(emp1);
        emp1.setEmployeeId(1);

        Employee emp2 = Employee.getEmployeeObject();
        System.out.println(emp2);

        Employee emp3 = Employee.getEmployeeObject();
        System.out.println(emp3);

        System.out.println(emp1.getEmployeeId());
        System.out.println(emp2.getEmployeeId());
        System.out.println(emp3.getEmployeeId());
        //emp.setEmployeeId(1);
        
    }

    public static void main(int [] args){

    }

    public static void main(int arg){

    }


}
