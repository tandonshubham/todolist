package com.example.todolist.resource;

import com.example.todolist.Services.UserServices;
import  com.example.todolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserServices userServices;
    @GetMapping("/user")
    public User getUser(){
        return userServices.getUser();
    }
}
