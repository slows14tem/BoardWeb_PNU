package com.rubypaper.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubypaper.board.domain.Comment;
import com.rubypaper.board.security.SecurityUser;
import com.rubypaper.board.service.CommentService;

@Controller
@RequestMapping("/board/")		//게시물과 댓글의 기능의 구분을 위해서 board와 comment의 controller를 구분했지만 requestmapping까지 구분될 필요는 없을것으로 보인다.
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	//Read는 게시판 조회와 함꼐 로드되어야 하기 때문에 BoardController의 getBoard에서 함꼐 구현
	
	@PostMapping("/insertComment")
	public String insertComment(Comment comment, @AuthenticationPrincipal SecurityUser principal) {
		comment.setMember(principal.getMember());
		commentService.insertComment(comment);
		return "redirect:/board/getBoard?seq="+comment.getBoard().getSeq();
		//forward일때 Request method 'POST' not supported (405)문제
			//get method로 변경하면 404 에러
		//redirect일때 다시 getBoard호출할때 board seq(pk) null 문제 - return redirect주소를 위와 같이 변경해서 해결(와 이딴게 오래걸림)		
	}
	
	@PostMapping("/updateComment")
	public String updateComment(Comment comment) {
		commentService.UpdateComment(comment);
		return "redirect:/board/getBoard?seq="+comment.getBoard().getSeq();
	}

	@PostMapping("/deleteComment")
	public String deleteComment(Comment comment) {
		commentService.deleteComment(comment);
		return "redirect:/board/getBoard?seq="+comment.getBoard().getSeq();
	}
}
