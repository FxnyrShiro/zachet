package com.example.myfibonacciapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FibonacciContr {

    @Autowired
    private FibonacciServ fibonacciService;

    @GetMapping("/fibonacci")
    public Map<String, Object> getFibonacciNumber(@RequestParam int index) {
        BigInteger value = fibonacciService.getFibonacciNumber(index);

        Map<String, Object> result = new HashMap<>();
        result.put("index", index);
        result.put("value", value);

        return result;
    }
}
