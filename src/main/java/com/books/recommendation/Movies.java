package com.books.recommendation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Movies")
public class Movies {
    @Id
    private String id;
    private String movieId;
    private String titles;
    private String genres;

    public Movies() {
    }

    public Movies(String movieId, String titles, String genres) {
        this.movieId =movieId;
        this.titles =titles;
        this.genres =genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return titles;
    }

    public void setTitle(String titles) {
        this.titles = titles;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}