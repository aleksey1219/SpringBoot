package com.calculator.calk;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public  class CalculatorServiceImpl implements HelloService {
    private int sum;
    private int sum1;
    private int sum2;
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public int sum( int sum1, int sum2) {
        sum=sum1+sum2;
        return sum;
    }

}
