package com.nandh.app.constructor;

public class ConstructorWithArgs {
    ConstructorWithArgs(int age, String name, double weight){
        System.out.println("Name is "+ name + " age: " + age + " and weight is " + weight);
    }

    public static void main(String[] args) {
        ConstructorWithArgs cwa = new ConstructorWithArgs(22, "nandh", 53);
    }
}
