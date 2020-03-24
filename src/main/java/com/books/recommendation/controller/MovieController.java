package com.books.recommendation.controller;

import com.books.recommendation.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    UsersRepository usersRepository;

    @RequestMapping("/")
    public String home(){
        return usersRepository.findAll().get(0).toString();
    }   
}