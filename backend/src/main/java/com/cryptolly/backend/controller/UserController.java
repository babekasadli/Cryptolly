package com.cryptolly.backend.controller;

import com.cryptolly.backend.dto.UserDTO;
import com.cryptolly.backend.dto.UserLoginDTO;
import com.cryptolly.backend.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value="/api") // http://localhost:8888/api
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        try {
            userService.saveUser(userDTO);
            logger.info("User registered successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
        } catch (IllegalArgumentException e) {
            logger.error("Bad request received: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            logger.error("An unexpected error occurred", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO userLoginDTO) {
        try {
            userService.loginUser(userLoginDTO.getEmail(), userLoginDTO.getPassword());
            logger.info("Login successful");
            return ResponseEntity.ok().body("Login successful");
        } catch (IllegalArgumentException e) {
            logger.error("Unauthorized access attempt: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        } catch (Exception e) {
            logger.error("An unexpected error occurred", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }

    @GetMapping("/register-page")
    public ResponseEntity<String> showRegisterPage() {
        // Logic to display the register page or any related information
        logger.info("Displayed the registration page");
        return ResponseEntity.ok().body("This is the registration page");
    }

    @GetMapping("/login-page")
    public ResponseEntity<String> showLoginPage() {
        // Logic to display the login page or any related information
        logger.info("Displayed the login page");
        return ResponseEntity.ok().body("This is the login page");
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        logger.info("Logout successful");
//        // Get the currently authenticated user
//        User user = userService.getCurrentUser();
//
//        // Invalidate the user's session or JWT token
//        userService.invalidateUserSession(user);

        // Return a success message
        return ResponseEntity.ok().body("Logout successful");
    }
}
