package com.nandh.app.instanceBlock;

public class InstanceExample4 {
    int i = 10;
    int j = 20;
    {
        System.out.println("Instance Block");
        int k = 30;
        System.out.println("instance variable " + i);
        System.out.println("instance variable " + j);
        System.out.println("local variable " + k);
        a1();
        a2();
    }
    void a1(){
        System.out.println("instance method");
    }
    static void a2(){
        System.out.println("static method");
    }
    InstanceExample4(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InstanceExample4();
    }
}
