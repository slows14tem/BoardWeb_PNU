package com.rubypaper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.Comment;
import com.rubypaper.board.domain.Member;
import com.rubypaper.board.persistence.CommentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentRepositoryTest {
	
	@Autowired
	private CommentRepository commentRepo;
	
//	@Test
	public void commentlist() {
		Board board = new Board();
		board.setSeq(48L);
		Pageable pageable = PageRequest.of(0, 10, Sort.Direction.DESC, "seq");
		Page<Comment> comlist = commentRepo.findByBoard_Seq(48L, pageable);
		System.out.println(comlist.isEmpty());
		for(Comment m : comlist) {
			System.out.println(m.getComments());
		}
	}
	
//	@Test
	public void commentTest() {
		Board board = new Board();
		board.setSeq(48L);
		Member member = new Member();
		member.setId("member");
		Comment comment = new Comment();
		for (int i=0;i<5;i++) {
			comment.setSeq(10L);
			comment.setComments("댓글테스트" + i);
			comment.setCreateDate(new Date());
			comment.setBoard(board);
			comment.setMember(member);
			commentRepo.save(comment);
		}
		
	}

}
