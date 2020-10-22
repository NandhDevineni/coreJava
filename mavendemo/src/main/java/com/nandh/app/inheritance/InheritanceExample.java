package com.nandh.app.inheritance;

class a1{
     int a = 10, b = 20;
    void m1(){
        System.out.println("sum is " + (a+b));
    }
}
class a2 extends a1{
    void m3(){
        System.out.println("multi is " + (a*b));
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        a2 a = new a2();
        a.m1();
    }
}
