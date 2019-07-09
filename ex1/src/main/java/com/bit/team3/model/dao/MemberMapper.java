package com.bit.team3.model.dao;


import com.bit.team3.model.dto.MemberBean;

public interface MemberMapper {

	MemberBean getMemberInfo(MemberBean bean);
	
	void setSignUp(MemberBean memberBean);
	
	public MemberBean emailCheck(String email) throws Exception;

}
