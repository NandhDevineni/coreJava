package com.nandh.app.methodOverriding;

class Parent3{
    final void m1(){
        System.out.println("Parent class method");
    }
}

public class MethodOverridingEx4 extends Parent3 {
//    void m1(){
//        System.out.println("child class method");
//    }
    public static void main(String[] args) {
        MethodOverridingEx4 me4 = new MethodOverridingEx4();
        me4.m1();
    }
}
