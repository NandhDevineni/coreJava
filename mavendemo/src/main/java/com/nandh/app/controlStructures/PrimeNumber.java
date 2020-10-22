package com.nandh.app.controlStructures;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 9;
        boolean isPrime = true;
        for(int i=2; i<=number-1; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
