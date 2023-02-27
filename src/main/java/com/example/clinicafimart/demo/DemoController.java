package com.example.clinicafimart.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/hello")
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }

  @GetMapping("/hola")
  public ResponseEntity<String> sayHola() {
    return ResponseEntity.ok("Hello from free endpoint");
  }

}
