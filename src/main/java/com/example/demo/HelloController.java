package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String getHello() {
        return "Hello world!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Guten Morgan!";
    }

    @GetMapping("/handshake")
    public String handshake() {
        return "Nice to meet you";
    }
}
