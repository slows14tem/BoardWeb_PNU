package com.rubypaper.board.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	private String comments;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate = new Date();
	
	@ManyToOne
    @JoinColumn(name = "BOARD_SEQ")
    private Board board;
 
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member; // 작성자
	

}
