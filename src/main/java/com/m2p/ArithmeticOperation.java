package com.m2p;

public class ArithmeticOperation {
    public int add(int firstInputNumber, int secondInputNumber){
        return firstInputNumber+secondInputNumber;
    }

    public int subtract(int firstInputNumber, int secondInputNumber){
        return firstInputNumber-secondInputNumber;
    }

    public int multiply(int firstInputNumber, int secondInputNumber){
        return firstInputNumber*secondInputNumber;
    }

    public int divide(int firstInputNumber, int secondInputNumber) throws ArithmeticException{
        if(secondInputNumber == 0){
            throw new ArithmeticException();
        }
        return firstInputNumber/secondInputNumber;
    }

}
