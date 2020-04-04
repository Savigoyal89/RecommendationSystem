package com.books.recommendation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends MongoRepository<Movies, String> {
    Movies findMoviesByMovieId(String movieId);

}
