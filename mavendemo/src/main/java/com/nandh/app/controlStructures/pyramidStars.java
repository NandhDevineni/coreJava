package com.nandh.app.controlStructures;

public class pyramidStars {
    public static void main(String[] args) {
        int odd = 1;
        int noOfSpaces = 3;
        for(int i=0; i<4; i++){
            for(int j=0; j<=noOfSpaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=odd; j++){
                System.out.print("*");
            }
            System.out.println();
            odd += 2;
            noOfSpaces -= 1;
        }
    }
}
