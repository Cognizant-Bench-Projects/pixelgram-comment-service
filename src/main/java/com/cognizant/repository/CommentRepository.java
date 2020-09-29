package com.cognizant.repository;

import com.cognizant.model.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends PagingAndSortingRepository<Comment, Integer> {

    @Query("FROM Comment c WHERE c.post.id = ?1")
    List<Comment> findCommentsByPost(int postId, Pageable pageable);

    @Query("SELECT COUNT(c) FROM Comment c WHERE c.post.id = ?1")
    int countNumberOfCommentsByPost(int postId);
}
