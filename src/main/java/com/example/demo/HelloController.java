package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "hii sharol";
    }

    @PostMapping("/webhook")
    public String handleWebhook(@RequestBody String payload) {
        System.out.println("Received from GitHub: " + payload);
        return "Webhook received";
    }
}
