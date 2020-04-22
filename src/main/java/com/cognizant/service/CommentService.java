package com.cognizant.service;

import com.cognizant.model.Comment;
import com.cognizant.model.Post;
import com.cognizant.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getCommentsByPost(int postId, int pageNum) {
        System.out.println("post id: " + postId + ", page number: " + pageNum);
        Post p = new Post();
        p.setId(1);
        Comment c = new Comment();
        c.setContent("Hello!");
        c.setDate("04/22/2020");
        c.setId(1);
        c.setPost(p);
        c.setUsername("user1");
        List<Comment> comments = new ArrayList<>();
        comments.add(c);
        if (postId == 2) {
            comments.add(c);
        }
        return comments;
//        return this.commentRepository.findCommentsByPost(postId);
    }

    public int getNumberOfCommentsByPost(int postId) {
        return this.commentRepository.countNumberOfCommentsByPost(postId);
    }
}
