package com.books.recommendation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "Mappings")
public class Mappings {
    @Id
    private String id;
    private String movieId;
    private String userId;
    private List mappingId;



    public Mappings() {

    }

    public Mappings(String movieId, String userId, List mappingId) {
        this.movieId =movieId;
        this.userId =userId;
        this.mappingId =mappingId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List getMappingId() {
        return mappingId;
    }

    public void setMappingId(List mappingId) {
        this.mappingId = mappingId;
    }
}