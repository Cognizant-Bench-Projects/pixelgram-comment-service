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

    @GetMapping("/page/{pageNum}")
    public List<Comment> getCommentsByPost(@PathVariable("postId") int postId, @PathVariable("pageNum") int pageNum) {
        return this.commentService.getCommentsByPost(postId, pageNum);
    }

    @GetMapping("/number-of-comments")
    public int getNumberOfCommentsByPost(@PathVariable int postId) {
        return this.commentService.getNumberOfCommentsByPost(postId);
    }
}
