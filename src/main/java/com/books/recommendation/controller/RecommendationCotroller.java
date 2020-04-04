package com.books.recommendation.controller;
import com.books.recommendation.MappingsRepository;
import com.books.recommendation.Movies;
import com.books.recommendation.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecommendationCotroller {
    @Autowired
    MappingsRepository mappingsRepository;
    @Autowired
    MoviesRepository moviesRepository;
    @CrossOrigin
    @RequestMapping(value = "/recommendation", params = { "userId", "movieId" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List home(@RequestParam("userId") String userId, @RequestParam("movieId") String movieId){
        List recommendedMovies;
        List movies = new ArrayList();
        recommendedMovies = mappingsRepository.findMappingsByUserIdAndMovieId(userId,movieId).get(0).getMappingId();
        Movies moviToView = moviesRepository.findMoviesByMovieId((String) movieId);
        movies.add(0,moviToView);

        for (int i=0; i<recommendedMovies.size(); i++)
        {

            Movies muviToRec = moviesRepository.findMoviesByMovieId((String) recommendedMovies.get(i));
            if(muviToRec.getMovieId() == movieId)
                continue;
            else
                movies.add(muviToRec);
        }
        return movies;
    }
}
