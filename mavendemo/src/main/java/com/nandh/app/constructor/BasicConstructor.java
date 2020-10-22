package com.nandh.app.constructor;

public class BasicConstructor {
    BasicConstructor(){
        System.out.println("inside constructor");
        a1();
    }
    void a1(){
        System.out.println("inside a1 method");
    }
    public static void main(String[] args) {
        BasicConstructor bc = new BasicConstructor();
    }
}
