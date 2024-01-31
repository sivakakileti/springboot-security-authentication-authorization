package com.spring.authentication.service;

import com.spring.authentication.model.AppUser;
import com.spring.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public AppUser saveUser(AppUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
      return userRepository.save(user);
    }

    public List<AppUser> getAllUsers() {
      return   userRepository.findAll();
    }
}
