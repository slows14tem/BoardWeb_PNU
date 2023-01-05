package com.rubypaper.board.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//연관관계 맵핑되면 롬복 Tostring이 생성될 때 순환참조가 일어나서 StackOverflowError가 발생한다.
//https://sorjfkrh5078.tistory.com/310

@Getter
@Setter
@Entity
public class Board {
	@Id@GeneratedValue
	@Column(name="BOARD_SEQ")
	private Long seq;
	
	private String title;
	
	private String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date createDate = new Date();
	
	@Column(updatable = true)
	private Long cnt = 0L;
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID", nullable=false, updatable=false)
	private Member member;
	
	@OneToMany(mappedBy = "board", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @OrderBy("seq asc") // 댓글 정렬
    private List<Comment> comments;

}
