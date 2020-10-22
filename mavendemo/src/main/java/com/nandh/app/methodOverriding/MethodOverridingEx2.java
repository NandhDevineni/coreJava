package com.nandh.app.methodOverriding;

// Return type must be same

class Parent1{
    void m1(){
        System.out.println("Parent class method");
    }
}
class Child1 extends Parent1 {
//    int m1(){
//        System.out.println("Child class method");
//        return 10;
//    }
}


public class MethodOverridingEx2 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.m1();
    }
}
