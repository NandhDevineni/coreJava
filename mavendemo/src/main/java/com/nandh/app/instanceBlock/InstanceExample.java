package com.nandh.app.instanceBlock;

public class InstanceExample {
    {
        System.out.println("Hello from instance block");
    }

    public static void main(String[] args) {
        new InstanceExample();
    }
}
