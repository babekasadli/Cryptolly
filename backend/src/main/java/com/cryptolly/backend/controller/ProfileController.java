package com.cryptolly.backend.controller;

import com.cryptolly.backend.dto.UserProfileDTO;
import com.cryptolly.backend.entity.User;
import com.cryptolly.backend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    private final UserService userService;

    public ProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserProfileDTO> getUserProfile(@PathVariable Long userId) {
        User user = userService.findUserById(userId);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        UserProfileDTO userProfileDTO = convertToUserProfileDTO(user);
        return ResponseEntity.ok(userProfileDTO);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUserProfile(@PathVariable Long userId, @RequestBody UserProfileDTO userProfileDTO) {
        User user = userService.findUserById(userId);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // Update user information
        user.setFirstName(userProfileDTO.getFirstName());
        user.setLastName(userProfileDTO.getLastName());
        user.setCountry(userProfileDTO.getCountry());
        user.setDob(userProfileDTO.getDateOfBirth());

        userService.updateUser(user);
        return ResponseEntity.ok("User profile updated successfully");
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUserProfile(@PathVariable Long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.ok("User profile deleted successfully");
    }

    private UserProfileDTO convertToUserProfileDTO(User user) {
        return new UserProfileDTO(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getCountry(),
                user.getDob()
        );
    }
}
