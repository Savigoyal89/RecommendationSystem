package com.books.recommendation.controller;

import com.books.recommendation.MappingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MappingsRepository mappingsRepository;

    @RequestMapping("/movies")
    public String home(){
        return mappingsRepository.findMappingsByUserIdAndMovieId("1.0","349").get(0).toString();

    }
}
