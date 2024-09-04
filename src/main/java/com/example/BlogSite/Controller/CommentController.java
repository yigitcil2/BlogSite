package com.example.BlogSite.Controller;

import com.example.BlogSite.Model.Comment;
import com.example.BlogSite.Service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private CommentService commentService;

    @PostMapping("/")
    public ResponseEntity<Comment> createComment (@RequestBody Comment comment) {
        Comment savedComment = commentService.saveComment(comment);
        return ResponseEntity.ok(savedComment);
    }

   @GetMapping("/{id}")
    public ResponseEntity<Optional<Comment>> getCommentById (@PathVariable String id) {
        Optional<Comment> comment = commentService.findById(id);
        return ResponseEntity.ok(comment);
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<Optional<Comment>> getCommentsByPostId(@PathVariable String postId) {
        Optional<Comment> comments = commentService.findByPostId(postId);
        return ResponseEntity.ok(comments);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Comment>> getAllComments() {
        List<Comment> comments = commentService.findAllComments();
        return ResponseEntity.ok(comments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable String id) {
        commentService.deleteComment(id);
        return ResponseEntity.noContent().build();
    }


}
