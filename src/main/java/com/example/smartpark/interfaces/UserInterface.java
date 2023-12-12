package com.example.smartpark.interfaces;

import com.example.smartpark.entities.User;

public interface UserInterface {

    public User login(String email, String password);
    public User register(User user);
    public User findById(long idUser);
}
