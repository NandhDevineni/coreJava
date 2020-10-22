package com.nandh.app.instanceBlock;

public class InstanceExample3 {
    int empId;
    {
        empId = 123;
    }
    void a1(){
        System.out.println(empId);
    }

    public static void main(String[] args) {
        InstanceExample3 ie3 = new InstanceExample3();
        ie3.a1();
    }
}
