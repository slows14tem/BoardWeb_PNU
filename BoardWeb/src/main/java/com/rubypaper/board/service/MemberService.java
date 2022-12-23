package com.rubypaper.board.service;

import com.rubypaper.board.domain.Member;

public interface MemberService {
	
	public void join(Member member);
	
	public Member info(Member member);
	
	public void updateMember(Member member);
	
	public void deleteMember(Member member);

}
