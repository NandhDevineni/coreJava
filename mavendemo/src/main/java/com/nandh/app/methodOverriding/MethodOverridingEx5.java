package com.nandh.app.methodOverriding;

class Parent4{
    void m1(){
        System.out.println("Parent class method");
    }
}

public class MethodOverridingEx5 extends Parent4 {
    void m1(){
        System.out.println("Child class method");
    }
    void m2(){
        System.out.println("child class method m2()");
    }

    public static void main(String[] args) {
        Parent4 p = new MethodOverridingEx5();
        p.m1();
        MethodOverridingEx5 me5 = (MethodOverridingEx5)p;
        me5.m2();
    }
}
