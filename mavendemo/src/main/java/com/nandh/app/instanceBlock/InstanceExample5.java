package com.nandh.app.instanceBlock;

public class InstanceExample5 {
    {
        System.out.println("Instance block");
    }
    InstanceExample5(){
        this(1);
        System.out.println("constructor with 0 agrs");
    }
    InstanceExample5(int a){
        System.out.println("Constructor with 1 arg");
    }

    public static void main(String[] args) {
        new InstanceExample5();
    }
}
