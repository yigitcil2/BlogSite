package com.example.BlogSite.Repository;

import com.example.BlogSite.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {
    Optional<Post> findByUserId(String userId);
}
