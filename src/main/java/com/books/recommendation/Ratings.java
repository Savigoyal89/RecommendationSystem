package com.books.recommendation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Ratings")
public class Ratings {
    @Id
    private String id;
    private String userId;
    private String movieId;
    private String rating;
    private String timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Ratings() {
    }

    public Ratings(String userId, String movieId, String rating, String timestamp) {
        this.userId = userId;
        this.movieId =movieId;
        this.rating =rating;
        this.timestamp =timestamp;
    }



}