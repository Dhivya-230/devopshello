package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "hii sharol";
    }

    @PostMapping("/github-webhook")
public String handleWebhook(@RequestBody String payload) {
    System.out.println(payload);
    return "OK";
}
}
