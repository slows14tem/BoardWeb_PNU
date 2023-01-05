package com.rubypaper.board.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.board.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
	
	//findBy 외래키(fk) 조회방법
	//	findBy + fk를 관리하는 entity필드명에서 첫글자 대문자 + _ + fk entity 식별자 필드명에서 첫글자 대문자
	//https://pooney.tistory.com/83
	Page<Comment> findByBoard_Seq(Long i, Pageable pageable);

}
