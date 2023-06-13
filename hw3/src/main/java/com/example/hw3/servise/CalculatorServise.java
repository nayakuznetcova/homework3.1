package com.example.hw3.servise;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServise implements CalculatorServiseInterface {

    @Override
    public String welcome() {
        return "<h1> Добро пожаловать в калькулятор </h1>";
    }

    @Override
    public Integer resultPlus(String num1, String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return result;
    }

    @Override
    public Integer resultMinus(String num1, String num2) {
        int result = Integer.parseInt(num1) - Integer.parseInt(num2);
        return result;
    }

    @Override
    public Integer resultMultiply(String num1, String num2) {
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return result;
    }

    @Override
    public Integer resultDivide(String num1, String num2) {
        if (Integer.parseInt(num2) == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        int result = Integer.parseInt(num1) / Integer.parseInt(num2);
        return result;

    }
}