package com.bit.team3.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bit.team3.model.dto.MemberBean;

public interface MemberService {
	
	MemberBean getMemberInfo(MemberBean bean);
	
	void doSignUp(MemberBean memberBean);
	
	public MemberBean emailCheck(String email) throws Exception;
	
}
