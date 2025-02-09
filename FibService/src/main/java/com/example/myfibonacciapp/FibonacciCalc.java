package com.example.myfibonacciapp;

import org.springframework.stereotype.Component;

@Component
public class FibonacciCalc {

    public Integer calculate(long index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
}
