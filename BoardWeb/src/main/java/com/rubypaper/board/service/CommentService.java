package com.rubypaper.board.service;

import org.springframework.data.domain.Page;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.Comment;

public interface CommentService {

	Page<Comment> getCommentList(Board board, int page);
	
	public void insertComment(Comment comment);
	
	public void UpdateComment(Comment comment);
	
	public void deleteComment(Comment comment);

}