package com.rubypaper.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.QBoard;
import com.rubypaper.board.domain.Search;
import com.rubypaper.board.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepo;
	
	

	public void insertBoard(Board board) {
		boardRepo.save(board);		
	}
	
	public void updateBoard(Board board) {
		Board findBoard = boardRepo.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());		
		boardRepo.save(findBoard);
	}
	
	public void deleteBoard(Board board) {
		boardRepo.deleteById(board.getSeq());
	}	
	
	public Board getBoard(Board board) {
		//다이나믹 쿼리를 통한 게시글 조회수 증가
		boardRepo.updateView(board.getSeq());
		return boardRepo.findById(board.getSeq()).get();
	}
		
	public Page<Board> getBoardList(Search search, int page) {		
		BooleanBuilder builder = new BooleanBuilder();
		
		QBoard qboard = QBoard.board;
		
		if(search.getSearchCondition().equals("TITLE")) {
		      builder.and(qboard.title.like("%" + search.getSearchKeyword() + "%"));
		} else if(search.getSearchCondition().equals("CONTENT")) {
		      builder.and(qboard.content.like("%" + search.getSearchKeyword() + "%"));
		}		
		
		Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "seq");
		
		return boardRepo.findAll(builder, pageable);
		//boardRepo.findAll(builder, pageable).~~를 통해서 page관련 메소드 활용 가능
	}

}
