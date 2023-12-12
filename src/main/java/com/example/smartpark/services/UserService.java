package com.example.smartpark.services;

import com.example.smartpark.entities.User;
import com.example.smartpark.interfaces.UserInterface;
import com.example.smartpark.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(long idUser) {
        return userRepository.findById(idUser).get();
    }
}
