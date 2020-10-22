package com.nandh.app.recursion;

public class RecursionExample {
    public static void main(String[] args) {
        countBackWards(5);
    }
    public static void countBackWards(int n){
        if(n == 0){
            System.out.println("Done!");
        } else{
            System.out.println(n);
            n--;
            countBackWards(n);
        }
    }
}
