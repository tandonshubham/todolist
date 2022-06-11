package com.example.todolist.Services;

import com.example.todolist.model.User;
import com.example.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServices {
    @Autowired
    private UserRepository userRepository;
    public User getUser(){
        return userRepository.getUser();
    }
}
