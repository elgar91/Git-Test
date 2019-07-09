package com.bit.team3.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.team3.model.dao.ReviewBoardMapper;
import com.bit.team3.model.dto.ReviewBoardBean;
import com.bit.team3.model.dto.ReviewCommentBean;

@Service("ReviewBoardService")
public class ReviewBoardServiceImpl implements ReviewBoardService{
	
	private static final Logger logger = LoggerFactory.getLogger(ReviewBoardServiceImpl.class);

	@Autowired
	ReviewBoardMapper reviewBoardMapper;
	
	@Override
	public List<ReviewBoardBean> getAllList() {
		List<ReviewBoardBean> beans = reviewBoardMapper.getAllReviewList();
		logger.info("beans : " + beans);
		return beans;
	}
	
	@Override
	public List<ReviewCommentBean> getAllCommentList(int boardNo) {
		List<ReviewCommentBean> commentBeans = reviewBoardMapper.getAllCommentList(boardNo);
		return commentBeans;
	}

	@Override
	public void doWrite(ReviewBoardBean reviewBoardBean) {
		
		reviewBoardMapper.setWrite(reviewBoardBean);
	}

	@Override
	public ReviewBoardBean detailView(int boardNo) {
		return reviewBoardMapper.detailView(boardNo);
	}

	@Override
	public void modifyView(ReviewBoardBean dto) {
		reviewBoardMapper.modifyView(dto);
		
	}

	//삭제 메소드
	@Override
	public void deleteView(ReviewBoardBean dto) {
		reviewBoardMapper.deleteView(dto);
		
	}

	// 댓글 쓰기
		@Override
		public void commentWrite(ReviewCommentBean reviewCommentBean) {
			reviewBoardMapper.commentWrite(reviewCommentBean);
		}

	// 댓글 삭제
		@Override
		public void deleteComment(ReviewCommentBean dto) {
			reviewBoardMapper.deleteComment(dto);
			
		}


}
