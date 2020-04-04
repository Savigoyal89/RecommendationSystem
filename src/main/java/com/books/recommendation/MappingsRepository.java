package com.books.recommendation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MappingsRepository extends MongoRepository<Mappings, String> {

    List<Mappings> findMappingsByUserIdAndMovieId(String userId, String movieId);

}
