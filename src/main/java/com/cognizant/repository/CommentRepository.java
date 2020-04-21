package com.cognizant.repository;

import com.cognizant.model.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Integer> {

//    List<Comment> findAllCommentByPost(int postId, Pageable pageable);
}
