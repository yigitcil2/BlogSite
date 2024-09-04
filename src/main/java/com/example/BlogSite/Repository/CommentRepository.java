package com.example.BlogSite.Repository;

import com.example.BlogSite.Model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CommentRepository extends MongoRepository<Comment, String> {
    Optional<Comment> findByName(String name);

    Optional<Comment> findByPostId(String postId);
}
