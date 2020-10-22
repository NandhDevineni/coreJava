package com.nandh.app.inheritance;

class Person {
   private String name;
   private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class Employee extends Person {
    private int empId;
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId() {
        return empId;
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("nandh");
        emp.setAge(22);
        emp.setEmpId(894876);
        System.out.println("Employee name " + emp.getName());
        System.out.println("Employee age " + emp.getAge());
        System.out.println("Employee Id " + emp.getEmpId());
    }
}
