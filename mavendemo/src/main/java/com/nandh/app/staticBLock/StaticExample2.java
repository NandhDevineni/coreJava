package com.nandh.app.staticBLock;

public class StaticExample2 {
    int i = 10;
    static int j = 20;
    static {
        StaticExample2 se2 = new StaticExample2();
        System.out.println(se2.i);
        System.out.println(j);
    }

    public static void main(String[] args) {

    }
}
