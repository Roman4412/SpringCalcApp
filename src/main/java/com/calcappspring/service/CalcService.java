package com.calcappspring.service;

import com.calcappspring.CalcInterface.CalcInterface;
import org.springframework.stereotype.Service;

@Service

public class CalcService implements CalcInterface {
    @Override
    public String toGreet() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num2 == null || num1 == null) {
            return "Отсутствует один из аргументов";
        } else {
            return String.format("%d + %d = %d", num1, num2, num1 + num2);
        }
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num2 == null || num1 == null) {
            return "Отсутствует один из аргументов";
        } else {
            return String.format("%d - %d = %d", num1, num2, num1 - num2);
        }
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num2 == null || num1 == null) {
            return "Отсутствует один из аргументов";
        } else {
            return String.format("%d * %d = %d", num1, num2, num1 * num2);
        }
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num2 == null || num1 == null || num2 == 0) {
            return "Аргумент отсутствует или равен 0";
        } else {
            int result =num1 / num2;
            return String.format("%d / %d = %d", num1, num2, result);
        }
    }
}