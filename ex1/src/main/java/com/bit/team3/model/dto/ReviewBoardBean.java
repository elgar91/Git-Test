package com.bit.team3.model.dto;

import java.sql.Date;

public class ReviewBoardBean {
	private int boardNo;
	private String nickname;
	private String title;
	private Date dateTime;
	private String reviewContent;
	private int reviewCount;
	private int likes;
	private int disLikes;
	private int comments;
	private int reviewGroup;
	private int reviewStep;
	private int reviewIndent;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDisLikes() {
		return disLikes;
	}
	public void setDisLikes(int disLikes) {
		this.disLikes = disLikes;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public int getReviewGroup() {
		return reviewGroup;
	}
	public void setReviewGroup(int reviewGroup) {
		this.reviewGroup = reviewGroup;
	}
	public int getReviewStep() {
		return reviewStep;
	}
	public void setReviewStep(int reviewStep) {
		this.reviewStep = reviewStep;
	}
	public int getReviewIndent() {
		return reviewIndent;
	}
	public void setReviewIndent(int reviewIndent) {
		this.reviewIndent = reviewIndent;
	}
	
	@Override
	public String toString() {
		return "ReviewBoardBean [boardNo=" + boardNo + ", nickname=" + nickname + ", title=" + title + ", dateTime="
				+ dateTime + ", reviewContent=" + reviewContent + ", reviewCount=" + reviewCount + ", likes=" + likes
				+ ", disLikes=" + disLikes + ", comments=" + comments + ", reviewGroup=" + reviewGroup + ", reviewStep="
				+ reviewStep + ", reviewIndent=" + reviewIndent + "]";
	}
	
}
