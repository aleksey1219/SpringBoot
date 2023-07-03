package com.calculator.calk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloCalculator {
        private final HelloService helloService;

    public HelloCalculator(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(path = "/calculator")
    public String helloCalc() {
        return helloService.helloCalc();
    }
    @GetMapping(path = "/plus")
    public String sum(@RequestParam  int sum1, @RequestParam int sum2) {
        return sum1+"+"+sum2+"="+ helloService.sum(sum1,sum2);
    }
}
