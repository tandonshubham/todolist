package com.example.todolist.repository;

import com.example.todolist.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {


    public User getUser(){
        User user=new User("shubham","222 leaside ave s",24);
        return user;
    }
}
