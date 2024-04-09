package com.cryptolly.backend.service.impl;

import com.cryptolly.backend.dto.UserDTO;
import com.cryptolly.backend.entity.User;
import com.cryptolly.backend.repository.UserRepository;
import com.cryptolly.backend.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    @Override
    public User saveUser(UserDTO userDTO) {
        if (findByEmail(userDTO.getEmail()) != null) {
            throw new IllegalArgumentException("Email is already in use");
        }
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        userRepository.save(user);
        logger.info("User saved: " + user.getEmail());
        return user;
    }

    @Transactional(readOnly = true)
    @Override
    public User loginUser(String email, String password) {
        User user = findByEmail(email);
        if (user == null) {
            throw new IllegalArgumentException("User with this email does not exist");
        }
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new IllegalArgumentException("Invalid password");
        }
        logger.info("User logged in: " + user.getEmail());
        return user;
    }

    @Transactional(readOnly = true)
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
