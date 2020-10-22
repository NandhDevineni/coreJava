package com.nandh.app.instanceBlock;

public class InstanceExample2 {
    {
        System.out.println("instance block");
    }
    InstanceExample2(){
        System.out.println("Constructor with 0 args");
    }
    InstanceExample2(int a){
        System.out.println("Constructor with 1 arg");
    }
    InstanceExample2(int a, int b){
        System.out.println("Constructor with 2 args");
    }

    public static void main(String[] args) {
        new InstanceExample2();
        new InstanceExample2(1);
        new InstanceExample2(1,2);
    }
}
