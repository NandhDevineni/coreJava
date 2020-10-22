package com.nandh.app.inheritance;

class B1 {
    static {
        System.out.println("Parent class static block");
    }
    {
        System.out.println("Parent class Instance block");
    }
    B1(){
        System.out.println("Parent class constructor");
    }
}

class B2 extends B1{
    static {
        System.out.println("child class static block");
    }
    {
        System.out.println("child class Instance block");
    }
    B2(){
        // by default super will execute;
        System.out.println("child class constructor");
    }
}

public class InheritanceExample4 {
    public static void main(String[] args) {
        new B2();
    }
}
