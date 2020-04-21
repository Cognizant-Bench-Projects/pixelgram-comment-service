package com.cognizant.controller;

import com.cognizant.model.Comment;
import com.cognizant.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/{postId}/comments")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getCommentsByPost(@PathVariable int postId) {
        return this.commentService.getAllCommentsByPost(postId);
    }
}
