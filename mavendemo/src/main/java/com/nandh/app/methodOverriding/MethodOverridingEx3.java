package com.nandh.app.methodOverriding;

import java.util.zip.DeflaterOutputStream;

class Animal {
//    Animal(){
//        System.out.println("Animal class constructor");
//    }
}

class Dog extends Animal {
//    Dog(){
//        System.out.println("Dog class constructor");
//    }
}

class Parent2 {
    Animal m1(){
        System.out.println("Parent class");
        Animal a = new Animal();
        return a;
    }
}

class Child2 {
    Dog m1(){
        System.out.println("Child class");
        return new Dog();
    }
}

public class MethodOverridingEx3 {
    public static void main(String[] args) {
        new Child2().m1();
    }
}
