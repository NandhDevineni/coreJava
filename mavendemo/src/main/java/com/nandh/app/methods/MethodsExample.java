package com.nandh.app.methods;

public class MethodsExample {
    int i = 10;
    static int j = 20;

    void add(){
        // instance variables can access directly in instance methods directly without creating any objects.
        System.out.println(i);
        System.out.println(j);
    }

    static void subtract(){
        MethodsExample me = new MethodsExample();
        System.out.println(j);
        System.out.println(me.i);
    }

    void argument(int i){
        System.out.println("local variable " + i);
        // this keyword is used when instance and local variables are same.
        System.out.println("instance variable " + this.i);
    }

    public static void main(String[] args) {
        System.out.println(MethodsExample.j);
        MethodsExample me = new MethodsExample();
        me.add();
        me.subtract();
    }
}
