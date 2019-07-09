package com.bit.team3.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.team3.model.dto.ReviewBoardBean;
import com.bit.team3.model.dto.ReviewCommentBean;
import com.bit.team3.model.service.ReviewBoardService;

@Controller
public class ReviewBoardController {
	private static final Logger logger = LoggerFactory.getLogger(ReviewBoardController.class);

	@Autowired
	ReviewBoardService reviewBoardService;

	@RequestMapping("/reviewList")
	private String reviewList(Model model) {
		List<ReviewBoardBean> reviewBoardAll = reviewBoardService.getAllList();
		logger.info("reviewBoardAll : " + reviewBoardAll);
		model.addAttribute("reviewBoardAll", reviewBoardAll);
		return "review/reviewList";
	}

	// detail 상세보기 넘어가는 곳
	@RequestMapping("reviewView")
	private String detailCall(int boardNo, Model model) {
		ReviewBoardBean dto = reviewBoardService.detailView(boardNo);
		List<ReviewCommentBean> reviewCommentAll = reviewBoardService.getAllCommentList(boardNo);
		logger.info("dto : " + dto);
		model.addAttribute("dto", dto);
		model.addAttribute("reviewCommentAll", reviewCommentAll);
		return "review/reviewView";
	}

	@RequestMapping("reviewWrite")
	private String reviewWrite() {
		// 세션 확인하여 로그인창으로 보낼지 글쓰기 창으로 보낼지 결정
		return "review/reviewWrite";
	}

	@RequestMapping("doWrite")
	private String doWrite(ReviewBoardBean reviewBoardBean, HttpServletRequest req) {
		logger.info("reviewBoardBean : " + reviewBoardBean);
		reviewBoardService.doWrite(reviewBoardBean);
		return "redirect:reviewList";
	}

	// modify 페이지로 넘어가는 곳
	@RequestMapping("reviewModify")
	private String modifyCall(int boardNo, Model model) {
		ReviewBoardBean mdto = reviewBoardService.detailView(boardNo);
		logger.info("mdto : " + mdto);
		model.addAttribute("mdto", mdto);

		return "review/reviewModify";
	}

	// modifySuccess 페이지로 넘어가는 곳
	@RequestMapping("reviewModifySuccess")
	private String modifySuccessCall(ReviewBoardBean dto) {
		reviewBoardService.modifyView(dto);

		return "redirect:reviewView?boardNo=" + dto.getBoardNo();

	}
	
	// 삭제 눌렀을 때 List 에서 지워지게 보내는 매핑
		@RequestMapping("reviewDeleteSuccess")
		private String deleteCall(ReviewBoardBean dto) {
			reviewBoardService.deleteView(dto);
			
			return "redirect:reviewList?boardNo=" + dto.getBoardNo();
			
		}
	
	// 댓글 쓰기
		@RequestMapping("commentWrite")
		private String commentWrite(ReviewCommentBean dto) {
			
			reviewBoardService.commentWrite(dto);
			
			return "redirect:reviewView?boardNo=" + dto.getBoardNo();
		}
		
	// 댓글 삭제 
		@RequestMapping("commentDeleteSuccess")
		private String commentDeleteCall(ReviewCommentBean dto) {
			reviewBoardService.deleteComment(dto);
			
			return "redirect:reviewView?boardNo=" + dto.getBoardNo();
		}
		
		
}
