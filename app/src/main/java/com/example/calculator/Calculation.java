package com.example.calculator;

public class Calculation {

    public float calculator(float number1,float number2,String operator)
    {
        switch(operator) {
            case "+":
                return number1+number2;

            case "-":
                return number1-number2;

            case "*":
                return number1*number2;

            case "/":
                return number1/number2;
            default:
                return 0;
        }
    }
}
