package com.rubypaper.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.Comment;
import com.rubypaper.board.domain.QComment;
import com.rubypaper.board.persistence.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository commentRepo;
	
	@Override
	public Page<Comment> getCommentList(Board board, int page){
		Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "seq");
		return commentRepo.findByBoard_Seq(board.getSeq(), pageable);

	}
	//등록은 아무나, 수정/삭제는 작성자만


}
