package com.example;

public class Math {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b  ; //coding fault
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b, int c){
        if (b != 0 && c==3) //10/0
            return a/b;
        else
            return -9999999;
    }
}
