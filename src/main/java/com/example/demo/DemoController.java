package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${my.name}")
    String name;

    @GetMapping("/names")
    public String getNames() {
        return name;
    }
}
