package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.entities.UserEntity;
import com.example.demo.services.dto.UserDto;

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
    
    public UserDto saveUser(UserDto user) {
    	UserEntity entity = new UserEntity();
    	entity.setName(user.getName());
    	entity.setEmail(user.getEmail());
    	
    	userRepository.save(entity);
    	
    	return user;
    }
}



