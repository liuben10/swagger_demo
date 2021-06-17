package com.swagger.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return a + b;
    }
}
