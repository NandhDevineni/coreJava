package com.nandh.app.controlStructures;

public class NumberTriangle {
    public static void main(String[] args) {
        int number = 5;
        for (int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
