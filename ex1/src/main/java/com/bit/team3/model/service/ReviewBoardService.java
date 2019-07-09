package com.bit.team3.model.service;

import java.util.List;

import com.bit.team3.model.dto.ReviewBoardBean;
import com.bit.team3.model.dto.ReviewCommentBean;


public interface ReviewBoardService {
	List<ReviewBoardBean> getAllList();

	// 댓글 작성 
	public void commentWrite(ReviewCommentBean reviewCommentBean);
	
	List<ReviewCommentBean> getAllCommentList(int boardNo);

	public ReviewBoardBean detailView(int boardNo);

	public void doWrite(ReviewBoardBean reviewBoardBean);

	public void modifyView(ReviewBoardBean dto);

	//삭제 
	public void deleteView(ReviewBoardBean dto);
	
	//댓글 삭제
	public void deleteComment(ReviewCommentBean dto);
	
	
}
