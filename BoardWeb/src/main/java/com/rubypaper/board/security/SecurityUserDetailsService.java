package com.rubypaper.board.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.Member;
import com.rubypaper.board.persistence.MemberRepository;

@Service
public class SecurityUserDetailsService implements UserDetailsService {
	// MemberRepository로 회원 정보를 조회하여 UserDetails 타입의 객체로 리턴한다.

	@Autowired
	private MemberRepository memberRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Member> optional = memberRepo.findById(username);
		if (!optional.isPresent()) {
			throw new UsernameNotFoundException(username + " 사용자 없음");
		} else {
			Member member = optional.get();
			return new SecurityUser(member);
		}
	}
}

//loadUserByUsername 메소드의 리턴타입이 UserDetails인라서 MemberRepository로 검색한 유저정보를 리턴할 수 없다.
//그래서 UserDetails 인터페이스를 구현한 User 클래스를 상속하는 securityUser를 생성하여 loadUserByUsername함수의 리턴타입으로 활용