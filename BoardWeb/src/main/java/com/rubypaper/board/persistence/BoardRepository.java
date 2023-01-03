package com.rubypaper.board.persistence;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.board.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>, 
QuerydslPredicateExecutor<Board> {

//	@Query("SELECT b FROM Board b")
//	Page<Board> getBoardList(Pageable pageable);
	
	//게시글 조회수 증가
	@Transactional	//데이터 수정, 삭제중 문제가 발생했을 때를 위한 롤백되도록 하는 어노테이션
	@Modifying	//executeQuery 에서 executeUpdate로 변경하는 어노테이션
    @Query("update Board b set b.cnt = b.cnt + 1 where b.seq = :seq")
    int updateView(Long seq);
}
