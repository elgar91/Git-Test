package com.bit.team3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.team3.model.dto.MemberBean;
import com.bit.team3.model.service.MemberService;



/**
 * @author USER
 *
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
	// 로그인 화면
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	
	// 로그인 처리
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String loginCheck(MemberBean memberBean, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		MemberBean getMemberInfo = memberService.getMemberInfo(memberBean);
		
		if(getMemberInfo == null) {
			session.setAttribute("member", null);
			return "member/login";
		}else {
			session.setAttribute("member", getMemberInfo);
			return "redirect:/";
		}
		
//		session.setAttribute("email", memberBean.getEmail());
//		logger.info("email::");
//		String nextPage = memberService.loginCheck(memberBean) ? "redirect:/" : "redirect:login";
//		return nextPage;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	@RequestMapping("signUp")
	public String signup() {
		return "member/signUp";
	}
	
	@RequestMapping(value="/doSignUp", method=RequestMethod.POST)
	public String signupProcess(MemberBean memberBean) {
		logger.info("memberBean::"+memberBean);
		
		//질의를 던진다. insert 실행할 서비스를 호출
		memberService.doSignUp(memberBean);
		return "redirect:login";
	}
	
//	@RequestMapping("/emailCheck.do")
//	public void emailCheck(String email, HttpServletResponse response) throws Exception{
//		logger.info("emailCheck");
//		
//		//String email = req.getParameter("email");
//		System.out.println(email);
//		MemberBean emailCheck = memberService.emailCheck(email);
//				
//		PrintWriter pw = response.getWriter();
//		
//		if(emailCheck != null) {
//			pw.print("이메일이 존재합니다. 다른 이메일을 입력해주세요.");
//		}else {
//			pw.print("사용가능한 이메일입니다.");
//		}
//	}
	@RequestMapping("/emailCheck.do")
	@ResponseBody
	public String emailCheck(String email) throws Exception{
		logger.info("emailCheck");
		
		//String email = req.getParameter("email");
		System.out.println(email);
		MemberBean emailCheck = memberService.emailCheck(email);
		
		String result="false";
		if(emailCheck!=null) {
			result="true";
		}
		System.out.println(result);
		
		return result;
	}

}