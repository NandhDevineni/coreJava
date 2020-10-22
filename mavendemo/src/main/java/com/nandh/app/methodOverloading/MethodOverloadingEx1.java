package com.nandh.app.methodOverloading;

import com.nandh.app.methods.MethodsExample;

//method overloading
public class MethodOverloadingEx1 {
    void m1(){
        System.out.println("method with zero arguments");
    }
    void m1(int a){
        System.out.println("method with one argument");
    }
    void m1(int a, int b){
        System.out.println("method with two argument");
    }
    void m1(char a){
        System.out.println("method with one argument and different dataType");
    }

    public static void main(String[] args) {
        MethodOverloadingEx1 me1 = new MethodOverloadingEx1();
        me1.m1();
        me1.m1(1);
        me1.m1(1, 2);
        me1.m1('q');
    }
}
