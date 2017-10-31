package com.example.demo.services;

import com.example.demo.services.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    public List<UserDto> getAllUsers() {
        UserDto user = new UserDto();
        user.setName("John Doe");
        user.setEmail("jdoe@example.com");

        List<UserDto> lst = new ArrayList<>();
        lst.add(user);

        return lst;
    }
}



