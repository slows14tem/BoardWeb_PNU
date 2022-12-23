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
		Long brdseq = board.getSeq();
		Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "seq");
		Page<Comment> comlist = commentRepo.findByBoard(board, pageable);
		for(Comment m : comlist) {
			System.out.println(m.toString());
		}
		return commentRepo.findByBoard(board, pageable);

	}


}
