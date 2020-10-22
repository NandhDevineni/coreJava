package com.nandh.app.methodOverriding;
//static methods can not override
class Parent5 {
    static void m1(){
        System.out.println("parent class method");
    }
}

public class MethodOverridingEx6 extends Parent5 {
//    void m1(){
//        System.out.println("child class method");
//    }
}
