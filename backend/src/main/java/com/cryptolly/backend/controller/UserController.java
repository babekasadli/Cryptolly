package com.cryptolly.backend.controller;

import com.cryptolly.backend.dto.UserDTO;
import com.cryptolly.backend.dto.UserLoginDTO;
import com.cryptolly.backend.entity.User;
import com.cryptolly.backend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value="/api") // http://localhost:8888/api
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        try {
            userService.saveUser(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO userLoginDTO) {
        try {
            userService.loginUser(userLoginDTO.getEmail(), userLoginDTO.getPassword());
            return ResponseEntity.ok().body("Login successful");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }

    @GetMapping("/register")
    public ResponseEntity<String> showRegisterPage() {
        // Logic to display the register page or any related information
        return ResponseEntity.ok().body("This is the registration page");
    }

    @GetMapping("/login")
    public ResponseEntity<String> showLoginPage() {
        // Logic to display the login page or any related information
        return ResponseEntity.ok().body("This is the login page");
    }
}
