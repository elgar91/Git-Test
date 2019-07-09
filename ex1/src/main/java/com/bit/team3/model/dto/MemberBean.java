package com.bit.team3.model.dto;

public class MemberBean {
	private String nickname;
	private String password;
	private String email;
	private String tel;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "MemberBean [nickname=" + nickname + ", password=" + password + ", email=" + email + ", tel=" + tel
				+ "]";
	}
	
	
}
