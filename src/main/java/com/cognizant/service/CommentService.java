package com.cognizant.service;

import com.cognizant.model.Comment;
import com.cognizant.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getCommentsByPost(int postId, int pageNum) {
        Pageable paging = PageRequest.of(pageNum, 5, Sort.by("id").ascending());
        List<Comment> pagedResult = this.commentRepository.findCommentsByPost(postId, paging);
        return pagedResult;
    }

    public int getNumberOfCommentsByPost(int postId) {
        return this.commentRepository.countNumberOfCommentsByPost(postId);
    }
}
