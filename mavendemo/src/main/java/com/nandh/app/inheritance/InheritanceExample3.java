package com.nandh.app.inheritance;

class Car {
    Car(){
        System.out.println("Car constructor");
    }
}

class Vehicle extends Car {
    Vehicle(){
        // By default it will call super();
        super();
        System.out.println("Vehicle Constructor");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
    }
}
