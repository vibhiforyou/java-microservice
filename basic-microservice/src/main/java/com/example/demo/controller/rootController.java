package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rootController {

    @GetMapping("/v1/greetings")
    public ResponseEntity greetingService()
    {
        return ResponseEntity.accepted().body("Hello user");
    }
}
