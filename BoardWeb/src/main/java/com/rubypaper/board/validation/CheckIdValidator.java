package com.rubypaper.board.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.rubypaper.board.domain.Member;
import com.rubypaper.board.persistence.MemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class CheckIdValidator extends AbstractValidator<Member> {
 
	@Autowired
    private MemberRepository memberRepo;
    @Override
    protected void doValidate(Member member, Errors errors) {
        if (memberRepo.existsById(member.getId())) {
            errors.rejectValue("id", "아이디 중복 오류", "이미 사용중인 아이디 입니다.");
        }
    }
}