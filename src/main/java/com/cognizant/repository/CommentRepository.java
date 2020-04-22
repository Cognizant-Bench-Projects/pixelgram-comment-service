package com.cognizant.repository;

import com.cognizant.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Integer> {

//    List<Comment> findCommentsByPost(int postId, Pageable pageable);

    @Query("SELECT COUNT(c) FROM Comment c WHERE c.post.id = ?1")
    int countNumberOfCommentsByPost(int postId);
}
