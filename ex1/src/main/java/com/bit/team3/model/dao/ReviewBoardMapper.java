package com.bit.team3.model.dao;

import java.util.List;

import com.bit.team3.model.dto.ReviewBoardBean;
import com.bit.team3.model.dto.ReviewCommentBean;

public interface ReviewBoardMapper {
	
	List<ReviewBoardBean> getAllReviewList();
	
	List<ReviewCommentBean> getAllCommentList(int boardNo);

	public ReviewBoardBean detailView(int boardNo);

	// 댓글쓰기
	public void commentWrite(ReviewCommentBean reviewCommentBean);
	
	public void setWrite(ReviewBoardBean reviewBoardBean);

	public void modifyView(ReviewBoardBean dto);

	// 게시물 삭제
	public void deleteView(ReviewBoardBean dto);

	// 댓글 삭제 
	public void deleteComment(ReviewCommentBean dto);
		
}
