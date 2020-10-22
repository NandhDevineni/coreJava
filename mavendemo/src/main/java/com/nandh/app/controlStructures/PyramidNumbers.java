package com.nandh.app.controlStructures;

public class PyramidNumbers {
    public static void main(String[] args) {
        int odd = 1;
        int noOfSpaces = 3;
        for(int i=1; i<=4; i++){
            int k = 0;

            for(int j=0; j<=noOfSpaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=odd; j++){
                if(j <= i){
                    k++;
                } else {
                    k--;
                }
                System.out.print(k + " ");
            }
            System.out.println();
            odd += 2;
            noOfSpaces = noOfSpaces-1;
        }
    }
}
