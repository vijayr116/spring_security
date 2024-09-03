package com.example.my_security.controller;
import com.example.my_security.model.User;
import com.example.my_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String  login(@RequestBody User user){
        System.out.println("User Login ....");
        return userService.login(user);
    }
    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        System.out.println("User Register ....");
        return userService.saveUser(user);
    };
    @GetMapping("/hello")
    public String greet(){
        return "Welcome to Security";
    }
}


