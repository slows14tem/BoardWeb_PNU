package com.rubypaper.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.Member;
import com.rubypaper.board.domain.Role;
import com.rubypaper.board.persistence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public void join(Member member) {
		//아이디 중복 체크 필요함
		System.out.println(member.toString());
		member.setPassword(encoder.encode(member.getPassword()));
		member.setEnabled(true);
		member.setRole(Role.ROLE_MEMBER);
		memberRepo.save(member);
	}
	
	public Member info(Member member) {
		Member temmem = memberRepo.findById(member.getId()).get();
		return temmem;
	}
	
	public void updateMember(Member member) {
		Member newMem = memberRepo.findById(member.getId()).get();
		newMem.setPassword(encoder.encode(member.getPassword()));
		newMem.setName(member.getName());
		memberRepo.save(newMem);
	}
	
	public void deleteMember(Member member) {
		memberRepo.deleteById(member.getId());
	}

}
