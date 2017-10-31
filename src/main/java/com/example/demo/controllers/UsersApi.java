package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UsersApi {

    @RequestMapping(method=RequestMethod.GET)
    public String getAllUsers() {
        return "Hello world!";
    }
}