package com.rubypaper.board.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
	
	Page<Comment> findByBoard_Seq(Long i, Pageable pageable);

//	@Query("SELECT b FROM Comment b")
//	Page<Comment> getCommentList(Pageable pageable);
}