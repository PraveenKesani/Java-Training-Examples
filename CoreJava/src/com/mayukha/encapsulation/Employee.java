package com.mayukha.encapsulation;

public class Employee {

    public static Employee emp;

    private Employee(){

    }

    public static Employee getEmployeeObject(){
        if(emp == null){
            emp = new Employee();
        }
        return emp;

        /*return new Employee();*/
    }

    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private float salary;
    private String emailId;

    public long getEmployeeId(){
        return employeeId;
    }

    public long setEmployeeId(int employeeId){
        return this.employeeId =  employeeId;
    }





    //

}
