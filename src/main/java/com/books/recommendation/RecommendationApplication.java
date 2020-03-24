package com.books.recommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecommendationApplication implements CommandLineRunner {
    @Autowired
    private  UsersRepository usersRepository;

    public static void main(String[] args) {
        SpringApplication.run(RecommendationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // fetch all customers
        System.out.println("Users found with findAll():");
        System.out.println("-------------------------------");
        for (Users user : usersRepository.findAll()) {
            System.out.println(user);
        }
        System.out.println();
    }
}



