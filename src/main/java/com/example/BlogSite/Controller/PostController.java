package com.example.BlogSite.Controller;

import com.example.BlogSite.Model.Post;
import com.example.BlogSite.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postService.savePost(post);
        return ResponseEntity.ok(savedPost);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Post>> GetPostById (@PathVariable String id) {
        Optional<Post> post = postService.findById(id);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Optional<Post>> getPostByUserId (@PathVariable String userId){
        Optional<Post> posts = postService.findByUserId(userId);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Post>> getAllPost() {
        List<Post> posts = postService.findAllPosts();
        return ResponseEntity.ok(posts);
    }

    public ResponseEntity<Void> deletePost (@PathVariable String id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }

}
