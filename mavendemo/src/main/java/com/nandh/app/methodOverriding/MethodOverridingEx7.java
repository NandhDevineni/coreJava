package com.nandh.app.methodOverriding;

class Parent6 {
    protected void m1(){
        System.out.println("Parent class method");
    }
}

public class MethodOverridingEx7 extends Parent6 {
    public void m1(){
        System.out.println("child class method");
    }
}
