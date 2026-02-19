package org.example;

public class Calculator {
    private int total = 0;

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public void setTotal(int value){
        this.total = value;
    }
    public int getTotal(){
        return this.total;
    }
    public void reset(){
        this.total = 0;
    }
    public String getOperationName(char symbol){
        if (symbol == '+') return "Addition";
        if (symbol == '-') return "Subtraction";
        return null;
    }

}
