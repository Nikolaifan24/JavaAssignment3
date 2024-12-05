package com.ilac.assignment3javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private Label result;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Button bSum;

    @FXML
    private Button bSubtraction;

    @FXML
    private Button bMultiplication;

    @FXML
    private Button bDivision;

    public void sum() throws Exception{
        try{
            Double num1 = Double.parseDouble(number1.getText());
            Double num2 = Double.parseDouble(number2.getText());
            CalculatorModel calculatorModel = new CalculatorModel(num1, num2);
            Double res = calculatorModel.sum();
            result.setText("The result is: " + res);
        }
        catch (RuntimeException e){
            result.setText("Please, type a number on both fields.");
        }

    }

    public void subtraction() throws Exception{
        try{
            Double num1 = Double.parseDouble(number1.getText());
            Double num2 = Double.parseDouble(number2.getText());
            CalculatorModel calculatorModel = new CalculatorModel(num1, num2);
            Double res = calculatorModel.subtraction();
            result.setText("The result is: " + res);
        }
        catch (RuntimeException e){
            result.setText("Please, type a number on both fields.");
        }
    }

    public void multiplication() throws Exception{
        try{
            Double num1 = Double.parseDouble(number1.getText());
            Double num2 = Double.parseDouble(number2.getText());
            CalculatorModel calculatorModel = new CalculatorModel(num1, num2);
            Double res = calculatorModel.multiplication();
            result.setText("The result is: " + res);
        }
        catch (RuntimeException e){
            result.setText("Please, type a number on both fields.");
        }
    }

    public void division() throws Exception{
        try{
            Double num1 = Double.parseDouble(number1.getText());
            Double num2 = Double.parseDouble(number2.getText());
            if (num2 == 0.0){
                throw new ArithmeticException();
            }
            CalculatorModel calculatorModel = new CalculatorModel(num1, num2);
            Double res = calculatorModel.division();
            result.setText("The result is: " + res);
        }
        catch (RuntimeException e){
            result.setText("Please, type a number on both fields. The second number cannot be zero.");
        }
    }

}
