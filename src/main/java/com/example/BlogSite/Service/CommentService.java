package com.example.BlogSite.Service;

import com.example.BlogSite.Model.Comment;
import com.example.BlogSite.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public Comment saveComment(Comment comment){
        comment.setCreateDate(LocalDateTime.now());
        return commentRepository.save(comment);
    }
    public List<Comment> findAllComments(){
        return commentRepository.findAll();
    }
    public Optional<Comment> findById(String id) {
        return commentRepository.findById(id);
    }
    public Optional<Comment> findByPostId(String postId){
        return commentRepository.findByPostId(postId);
    }
    public void deleteComment(String id){
        commentRepository.deleteById(id);
    }
}
