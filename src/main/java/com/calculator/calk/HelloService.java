package com.calculator.calk;

import org.springframework.web.bind.annotation.RequestParam;

public interface HelloService {
    String helloCalc();

    int sum(int num1, int num2);

    int min(int num1, int num2);

    int multiply(int sum1, int sum2);

    double divide(int num1, int num2);
}
