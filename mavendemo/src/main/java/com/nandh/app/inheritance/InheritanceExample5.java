package com.nandh.app.inheritance;

class C1 {
    static {
        System.out.println("Parent class static block");
    }
    {
        System.out.println("Parent class Instance block");
    }
    C1(){
        System.out.println("Parent class constructor");
    }
    C1(int a){
        System.out.println("Parent class constructor with one argument");
    }
}

class C2 extends C1{
    static {
        System.out.println("child class static block");
    }
    {
        System.out.println("child class Instance block");
    }
    C2(){
        // by default super will execute;
        System.out.println("child class constructor");
    }
    C2(int a){
        super(2);
        System.out.println("child class constructor with one argument");
    }
}

public class InheritanceExample5 {
    public static void main(String[] args) {
        new C2();
        new C2(1);
    }

}
