package com.example.demo.bdd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/newEndpoint")
    public ResponseEntity<String> newEndpoint() {
        return ResponseEntity.ok("New endpoint response");
    }
}
