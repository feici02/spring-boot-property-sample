package com.example.springbootpropertysample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
    private final GreetingConfig greetingConfig;

    public GreetingController(GreetingConfig greetingConfig) {
        this.greetingConfig = greetingConfig;
    }

    @GetMapping("/greeting")
    public String getGreeting() {
        return String.format("%s, Harry!", greetingConfig.getMessage());
    }
}
