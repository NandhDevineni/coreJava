package com.nandh.app.methodOverloading;

//constructor overloading
public class MethodOverloadingEx2 {
    MethodOverloadingEx2(){
        System.out.println("constructor with zero arguments");
    }
    MethodOverloadingEx2(int a){
        System.out.println("constructor with zero arguments");
    }
    MethodOverloadingEx2(int a, int b){
        System.out.println("constructor with two arguments");
    }
    MethodOverloadingEx2(char a){
        System.out.println("constructor with one arguments different datatype");
    }

    public static void main(String[] args) {
        new MethodOverloadingEx2();
        new MethodOverloadingEx2(1);
        new MethodOverloadingEx2(1,2);
        new MethodOverloadingEx2('C');
    }
}
