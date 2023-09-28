package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(String num1, String num2) {
        try {
            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            return num1 + " + " + num2 + " = " + sum;
        }
        catch (Exception ex) {
            return "Ошибка: " + ex.getMessage();
        }
    }

    public String minus(String num1, String num2) {
        try {
            int minus = Integer.parseInt(num1) - Integer.parseInt(num2);
            return num1 + " - " + num2 + " = " + minus;
        }
        catch (Exception ex) {
            return "Ошибка: " + ex.getMessage();
        }
    }

    public String multiply(String num1, String num2) {
        try {
            int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
            return num1 + " * " + num2 + " = " + multiply;
        }
        catch (Exception ex) {
            return "Ошибка: " + ex.getMessage();
        }
    }

    public String divide(String num1, String num2) {
        try {
            int divide = Integer.parseInt(num1) / Integer.parseInt(num2);
            return num1 + " / " + num2 + " = " + divide;
        }
        catch (Exception ex) {
            return "Ошибка: " + ex.getMessage();
        }
    }
}
