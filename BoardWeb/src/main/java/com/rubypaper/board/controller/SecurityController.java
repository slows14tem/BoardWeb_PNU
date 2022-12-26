package com.rubypaper.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.board.domain.Member;
import com.rubypaper.board.service.MemberService;

@Controller
public class SecurityController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/system/login")
	public void login() {}

	@GetMapping("/system/accessDenied")
	public void accessDenied() {}
	
	@GetMapping("/system/logout")
	public void logout() {}
	
	@GetMapping("/system/join")
	public String joinView() {
		return "/system/join";
	}
	
	@PostMapping("/system/joinMem")
	public String join(Member member) {
		return "redirect:/system/login";
	}

	@GetMapping("/admin/adminPage")
	public void admin() {}
}
