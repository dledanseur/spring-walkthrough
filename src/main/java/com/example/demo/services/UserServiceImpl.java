package com.example.demo.services;

import com.example.demo.repositories.UserRepository;
import com.example.demo.services.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {

        return userRepository.findAll().stream().map( e -> {

            UserDto dto = new UserDto();
            dto.setName(e.getName());
            dto.setEmail(e.getEmail());
            return dto;

        }).collect(Collectors.toList());

    }
}



