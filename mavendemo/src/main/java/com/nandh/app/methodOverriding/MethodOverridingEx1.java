package com.nandh.app.methodOverriding;

class Parent {
    void m1(){
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void m1(){
        System.out.println("child method");
    }
}

public class MethodOverridingEx1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
    }

}
