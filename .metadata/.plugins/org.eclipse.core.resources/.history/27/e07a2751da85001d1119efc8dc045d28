package com.rubypaper.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.domain.Search;
import com.rubypaper.board.security.SecurityUser;
import com.rubypaper.board.service.BoardService;
import com.rubypaper.board.service.CommentService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	private BoardService boardService;
	@Autowired
	private CommentService commentService;

	@GetMapping("/insertBoard")
	public String insertBoardView() {
		return "board/insertBoard";
	}

	@PostMapping("/insertBoard")
	public String insertBoard(Board board, @AuthenticationPrincipal SecurityUser principal) {
		board.setMember(principal.getMember());	//없으면 PropertyValueException 뜸
		boardService.insertBoard(board);
		return "redirect:getBoardList";
	}

	@PostMapping("/updateBoard")
	public String updateBoard(Board board) {
		boardService.updateBoard(board);
		return "forward:getBoardList";
	}

	@GetMapping("/deleteBoard")
	public String deleteBoard(Board board) {
		boardService.deleteBoard(board);
		return "forward:getBoardList";
	}

	@RequestMapping("/getBoardList")
	public String getBoardList(Model model, Search search, @RequestParam(required=false, defaultValue = "0", value = "page") int page) {
		//교제 274 page객체를 통해서 얻을 수 있는 정보 확인
		if (search.getSearchCondition() == null)
			search.setSearchCondition("TITLE");
		if (search.getSearchKeyword() == null)
			search.setSearchKeyword("");
		Page<Board> boardList = boardService.getBoardList(search, page);
		int totalPage = boardList.getTotalPages();
		model.addAttribute("search", search);
		model.addAttribute("boardList", boardList);
		model.addAttribute("totalPage", totalPage);
		return "board/getBoardList";
	}

	@GetMapping("/getBoard")
	public String getBoard(Board board, Model model, @RequestParam(required=false, defaultValue = "0", value = "page") int page, 
			@AuthenticationPrincipal SecurityUser principal) {
		model.addAttribute("board", boardService.getBoard(board));
		//게시글 상세에서 해당 게시물의 댓글들을 모아오기 위해서 comment를 모아와서 getBoard에 넘겨줌
		model.addAttribute("comment", commentService.getCommentList(board, page));
		//현재 인증받은 멤버의 정보를 모델에 담아 뷰에 전달(게시물, 댓글의 작성자와 로그인 맴버를 비교하기 위해서)
		model.addAttribute("member", principal.getMember());
		return "board/getBoard";
	}
	
	

}
