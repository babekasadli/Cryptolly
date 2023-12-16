package com.cryptolly.backend.service;

import com.cryptolly.backend.dto.UserDTO;
import com.cryptolly.backend.entity.User;

public interface UserService {
    User saveUser(UserDTO userDTO);
    User loginUser(String email, String password);
    User findByEmail(String email);
    User findUserById(Long userId);
    void updateUser(User user);
    void deleteUserById(Long userId);
}
