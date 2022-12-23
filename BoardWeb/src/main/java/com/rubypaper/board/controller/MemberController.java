package com.rubypaper.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubypaper.board.domain.Member;
import com.rubypaper.board.security.SecurityUser;
import com.rubypaper.board.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberInfo")
	public String info(Member member, @AuthenticationPrincipal SecurityUser principal, Model model) {
		member.setId(principal.getUsername());
		model.addAttribute("member", memberService.info(member));
		return "member/memberInfo";
	}
	
	@PostMapping("/updateMember")
	public String updateMember(Member member, Model model) {
		memberService.updateMember(member);
		System.out.println(memberService.info(member).toString());
		model.addAttribute("member", memberService.info(member));
		return "redirect:/board/getBoardList";
	}
	
	@GetMapping("/deleteMember")
	public String deleteMember(Member member, @AuthenticationPrincipal SecurityUser principal) {
		member.setId(principal.getUsername());
		memberService.deleteMember(member);
		return "redirect:/";
	}

}
