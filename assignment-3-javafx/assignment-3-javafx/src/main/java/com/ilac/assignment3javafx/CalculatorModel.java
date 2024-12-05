package com.ilac.assignment3javafx;

public class CalculatorModel {
    private Double num1;
    private Double num2;

    public CalculatorModel(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double sum()  throws Exception{
        return num1 + num2;
    }

    public Double subtraction() throws Exception{
        return num1 - num2;
    }

    public Double multiplication() throws Exception{
        return num1 * num2;
    }

    public Double division() throws Exception{
        return num1 / num2;
    }
}
