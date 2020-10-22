package com.nandh.app.inheritance;

class Calculator {
    public float add(float a, float b){
        return a+b;
    }
    public float sub(float a, float b){
        return a-b;
    }
    public float divide(float a, float b){
        return a%b;
    }
    public float multiply(float a, float b){
        return a*b;
    }
}

class Advance extends Calculator{
    public float mod(float a, float b){
        return a%b;
    }
    public float sqr(float m){
        return m*m;
    }
    public float squrt(float m){
//        System.out.println(Math.sqrt(m));
        float squrt = (float) Math.sqrt(m);
        return squrt;
    }
}

class Area extends Advance {
    public float square(float m){
        return m*m;
    }
    public float rectangle(float l, float b){
        return l * b;
    }
    public float circle(float r){
        return (float) (3.14*r*r);
    }
}

public class InheritanceExample2 {

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.add(2,4));
        System.out.println(a.sub(6,9));
    }
}
