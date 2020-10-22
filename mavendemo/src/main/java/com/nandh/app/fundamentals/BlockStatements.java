package com.nandh.app.fundamentals;

public class BlockStatements {
    {
        System.out.println("hello from ano");
    }
    static {
        System.out.println("Hello form static");
    }
    public static void main(String[] args) {
        System.out.println("Hello from main");
        BlockStatements block = new BlockStatements();
    }
}
