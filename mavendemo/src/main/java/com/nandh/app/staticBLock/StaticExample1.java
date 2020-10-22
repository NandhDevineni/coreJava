package com.nandh.app.staticBLock;

public class StaticExample1 {
    static {
        System.out.println("static block");
        new StaticExample1();
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        System.out.println("main method");

    }
}
