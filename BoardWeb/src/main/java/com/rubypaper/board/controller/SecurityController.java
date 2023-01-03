package com.rubypaper.board.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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
	public String join(@Valid Member member, Errors errors, Model model) {
		
		if (errors.hasErrors()) {
            /* 회원가입 실패시 입력 데이터 값을 유지 */
            model.addAttribute("member", member);
 
            /* 유효성 통과 못한 필드와 메시지를 핸들링 */
            Map<String, String> validatorResult = memberService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
            }
            /* 회원가입 페이지로 다시 리턴 */
            return "/system/join"; 
        }
		
		memberService.join(member);
		return "redirect:/system/login";
	}

	@GetMapping("/admin/adminPage")
	public void admin() {}
}
