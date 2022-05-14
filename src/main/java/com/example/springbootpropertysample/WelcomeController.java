package com.example.springbootpropertysample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
    @Value("${welcome.line}")
    private String welcomeLine;

    @Value("${welcome.message}")
    private String welcomeMessage;

    // It's not defined in application.yml,
    // so default value will be used.
    @Value("${welcome.message2: How are you doing?}")
    private String welcomeMessage2;

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeLine;
    }

    @GetMapping("/welcome/message")
    public String getMessage() {
        return welcomeMessage;
    }

    @GetMapping("/welcome/message2")
    public String getMessage2() {
        return welcomeMessage2;
    }
}
