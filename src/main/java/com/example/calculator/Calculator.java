package com.example.calculator;

public class Calculator {

    public Integer sum (Integer val1, Integer val2){
        return val1 + val2;
    }

    public Integer subtraction (Integer val1, Integer val2){
        return val1 - val2;
    }

    public Integer multiply (Integer val1, Integer val2){
        return val1 * val2;
    }

    public Integer division (Integer val1, Integer val2){
        return val1/val2;
    }

    public Double pow (Double val1, Double val2){
        return Math.pow(val1, val2);
    }

    public Double sqrt (Double val1){
        return Math.sqrt(val1);
    }

}
