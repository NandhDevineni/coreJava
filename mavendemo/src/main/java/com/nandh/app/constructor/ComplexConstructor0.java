package com.nandh.app.constructor;

public class ComplexConstructor0 {
    ComplexConstructor0(){
        this(1);
        System.out.println("without arguments");
    }
    ComplexConstructor0(int a){
        this(2,3);
        System.out.println("With one argument");
    }
    ComplexConstructor0(int a, int b){
        System.out.println("with two arguments");
    }

    public static void main(String[] args) {
        ComplexConstructor0 cc = new ComplexConstructor0();
    }
}
