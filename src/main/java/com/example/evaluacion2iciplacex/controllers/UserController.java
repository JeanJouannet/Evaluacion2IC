package com.example.evaluacion2iciplacex.controllers;

import com.example.evaluacion2iciplacex.models.Usuario;
import com.example.evaluacion2iciplacex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Usuario usuario) {
        boolean isValidUser = userService.validateUser(usuario.getUsername(), usuario.getPassword());
        if (isValidUser) {
            return ResponseEntity.ok("Usuario válido");
        } else {
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }
    }
}

