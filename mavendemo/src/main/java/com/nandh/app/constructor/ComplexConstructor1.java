package com.nandh.app.constructor;

public class ComplexConstructor1 {
    int age;
    String name;
    double weight;
    ComplexConstructor1(int age, String name, double weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
        System.out.println("Name is "+ name + " age: " + age + " and weight is " + weight);
    }

    public static void main(String[] args) {
        ComplexConstructor1 cc = new ComplexConstructor1(22, "nandh", 53.77);
    }
}
