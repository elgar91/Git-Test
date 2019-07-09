package com.bit.team3.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class ProductBoardBean {
	private String productBoardNo;
	private String nickName;
	private String title;
	private String datetime;	
	private String productContent;
	private String productName;
	private int productPrice;
	private int productCode;
	private String picUrl1;
	private MultipartFile file01;
	private String picUrl2;
	private MultipartFile file02;
	private String picUrl3;
	private MultipartFile file03;
	public String getProductBoardNo() {
		return productBoardNo;
	}
	public void setProductBoardNo(String productBoardNo) {
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
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getProductContent() {
		return productContent;
	}
	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getPicUrl1() {
		return picUrl1;
	}
	public void setPicUrl1(String picUrl1) {
		this.picUrl1 = picUrl1;
	}
	public MultipartFile getFile01() {
		return file01;
	}
	public void setFile01(MultipartFile file01) {
		this.file01 = file01;
	}
	public String getPicUrl2() {
		return picUrl2;
	}
	public void setPicUrl2(String picUrl2) {
		this.picUrl2 = picUrl2;
	}
	public MultipartFile getFile02() {
		return file02;
	}
	public void setFile02(MultipartFile file02) {
		this.file02 = file02;
	}
	public String getPicUrl3() {
		return picUrl3;
	}
	public void setPicUrl3(String picUrl3) {
		this.picUrl3 = picUrl3;
	}
	public MultipartFile getFile03() {
		return file03;
	}
	public void setFile03(MultipartFile file03) {
		this.file03 = file03;
	}
	@Override
	public String toString() {
		return "ProductBoardBean [productBoardNo=" + productBoardNo + ", nickName=" + nickName + ", title=" + title
				+ ", datetime=" + datetime + ", productContent=" + productContent + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", productCode=" + productCode + ", picUrl1=" + picUrl1
				+ ", file01=" + file01 + ", picUrl2=" + picUrl2 + ", file02=" + file02 + ", picUrl3=" + picUrl3
				+ ", file03=" + file03 + "]";
	}

	
	

	
	
	
}