package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repositories.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
