package com.bit.team3.model.service;

import java.util.List;

import org.springframework.ui.Model;

import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;


public interface ProductBoardService {
	List<ProductBoardBean> getAllList();
	
	public ProductBoardBean detailView(int productboardNo);
	
	public void productView(ProductBoardBean dto);
	
	public void doProductWrite(ProductBoardBean productBoardBean);
	
	public void modifyView(ProductBoardBean dto);
	
	ProductBoardBean getViewList();
	
	ProductBoardOrderBean getOrderInfo( int productBoardNo, String nickName);
	
	public void productDelete(int productBoardNo);

	public List<ProductBoardBean> desksView();
	public List<ProductBoardBean> shelvesView();
	public List<ProductBoardBean> screensView();
	public List<ProductBoardBean> storagesView();
}
