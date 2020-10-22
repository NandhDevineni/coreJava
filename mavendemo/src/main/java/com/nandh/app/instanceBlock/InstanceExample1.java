package com.nandh.app.instanceBlock;

public class InstanceExample1 {
    {
        System.out.println("instance block");
    }
    InstanceExample1(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InstanceExample1();
    }
}
