package com.example.smartpark.controllers;

import com.example.smartpark.entities.User;
import com.example.smartpark.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInterface userInterface;

    @GetMapping("login/{email}/{password}")
    public User login(@PathVariable String email, @PathVariable String password) {
        return userInterface.login(email, password);
    }

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return userInterface.register(user);
    }

    @GetMapping("{idUser}")
    public User findById(@PathVariable long idUser) {
        return userInterface.findById(idUser);
    }
}
