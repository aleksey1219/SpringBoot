package com.calculator.calk;

import org.springframework.web.bind.annotation.RequestParam;

public interface HelloService {
    String helloCalc();

    int sum(int sum1, int sum2);

    int min(int sum1, int sum2);
}
