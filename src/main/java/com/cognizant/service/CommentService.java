package com.cognizant.service;

import com.cognizant.model.Comment;
import com.cognizant.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllCommentsByPost(int postId) {
        System.out.println(postId);
        Comment c = new Comment();
        List<Comment> comments = new ArrayList<>();
        comments.add(c);
        return comments;
//        return this.commentRepository.findAllCommentByPost(postId);
    }
}
