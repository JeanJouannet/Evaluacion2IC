package com.example.evaluacion2iciplacex.services;

import com.example.evaluacion2iciplacex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean validateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).isPresent();
    }
}
