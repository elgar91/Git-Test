package com.bit.team3.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.team3.model.dao.MemberMapper;
import com.bit.team3.model.dto.MemberBean;

@Service("memberSerivce")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	
	@Override
	public MemberBean getMemberInfo(MemberBean bean) {
		return memberMapper.getMemberInfo(bean);
	}


	@Override
	public void doSignUp(MemberBean memberBean) {
		// TODO Auto-generated method stub
		memberMapper.setSignUp(memberBean);
	}


	@Override
	public MemberBean emailCheck(String email) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.emailCheck(email);
	}


}
