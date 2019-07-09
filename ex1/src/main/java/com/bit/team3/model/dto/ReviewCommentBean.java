package com.bit.team3.model.dto;

import java.sql.Date;

public class ReviewCommentBean {
	private int commentNo;
	private int boardNo;
	private String nickname;
	private String reviewCommentContent;
	private Date dateTime;
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getReviewCommentContent() {
		return reviewCommentContent;
	}
	public void setReviewCommentContent(String reviewCommentContent) {
		this.reviewCommentContent = reviewCommentContent;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		return "ReviewCommentBean [commentNo=" + commentNo + ", boardNo=" + boardNo + ", nickname=" + nickname
				+ ", reviewCommentContent=" + reviewCommentContent + ", dateTime=" + dateTime + "]";
	}
	
}
