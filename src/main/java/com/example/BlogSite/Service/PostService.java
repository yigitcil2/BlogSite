package com.example.BlogSite.Service;

import com.example.BlogSite.Model.Post;
import com.example.BlogSite.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post){
        post.setCreateDate(LocalDateTime.now());
        return postRepository.save(post);
    }
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
    public Optional<Post> findById(String id) {
        return postRepository.findById(id);
    }
    public Optional<Post> findByUserId(String userId){
        return postRepository.findByUserId(userId);
    }
    public void deletePost(String id) {
        postRepository.deleteById(id);
    }
}
