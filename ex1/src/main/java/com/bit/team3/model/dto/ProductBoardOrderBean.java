package com.bit.team3.model.dto;

public class ProductBoardOrderBean {
	
	private int productBoardNo;
	private String nickName;
	private String title;
	private String tel;	
	private String email;
	
	
	public int getProductBoardNo() {
		return productBoardNo;
	}
	public void setProductBoardNo(int productBoardNo) {
		this.productBoardNo = productBoardNo;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "ProductBoardOrderBean [productBoardNo=" + productBoardNo + ", nickName=" + nickName + ", title=" + title
				+ ", tel=" + tel + ", email=" + email + "]";
	}
	
	
	
	
}
