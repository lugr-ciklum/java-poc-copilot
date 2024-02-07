package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/newApi")
    public ResponseEntity<String> newApi() {
        return ResponseEntity.ok("Response from new API");
    }
}
