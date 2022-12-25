package com.rubypaper.board.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.Comment;
import com.rubypaper.board.persistence.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository commentRepo;
	
	public Page<Comment> getCommentList(Board board, int page){
		//갯수가 많아지면 페이징구현 필요할 가능성 있어보임.
		Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "seq");
		return commentRepo.findByBoard_Seq(board.getSeq(), pageable);
	}
	//등록은 아무나, 수정/삭제는 작성자만 가능하게 수정
	public void insertComment(Comment comment) {
		commentRepo.save(comment);		
	}
	
	public void UpdateComment(Comment comment) {
		Comment newCmt = commentRepo.findById(comment.getSeq()).get();
		newCmt.setComments(comment.getComments());
		newCmt.setCreateDate(new Date());
		commentRepo.save(newCmt);
	}
	
	public void deleteComment(Comment comment) {
		commentRepo.deleteById(comment.getSeq());
	}


}
