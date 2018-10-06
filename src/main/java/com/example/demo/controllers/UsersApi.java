package com.example.demo.controllers;

import com.example.demo.services.UserService;
import com.example.demo.services.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UsersApi {

    @Autowired
    private UserService userService;

    @RequestMapping(method=RequestMethod.GET)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public UserDto postUser(@RequestBody UserDto user) {
        return userService.saveUser(user);
    }
}