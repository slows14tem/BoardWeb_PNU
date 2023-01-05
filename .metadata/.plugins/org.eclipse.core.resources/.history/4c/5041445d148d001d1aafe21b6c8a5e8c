package com.rubypaper.board.security;

import java.io.Serializable;
import com.rubypaper.board.domain.Member;

import lombok.Getter;

@Getter
public class SessionUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;

    public SessionUser(Member member) {
    	this.id = member.getId();
    	this.name = member.getName();
    }
}