package com.codigo.mslogin.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/hola")
    public ResponseEntity<String> saludoUser(){
        return ResponseEntity.ok("hola usuario");
    }
}
