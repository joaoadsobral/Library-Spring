package com.john.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/post")
    public String sayPost(
            @RequestBody String message
    ) {
        return "post " + message;
    }
}
