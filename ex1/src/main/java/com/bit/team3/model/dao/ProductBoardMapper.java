package com.bit.team3.model.dao;

import java.util.List;
import java.util.Map;

import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;

public interface ProductBoardMapper {
	List<ProductBoardBean> getAllProductList();

	public void doWrite(ProductBoardBean productBoardBean);

	public void modifyView(ProductBoardBean dto);
	
	public ProductBoardBean detailView(int  productboardNo);

	ProductBoardBean getProductReviewList();
	
	ProductBoardOrderBean getOrderInfo(Map<String, Object> order); 
	
	void productDelete(int  productboardNo);
	
	public List<ProductBoardBean> desksView();
	public List<ProductBoardBean> shelvesView();
	public List<ProductBoardBean> screensView();
	public List<ProductBoardBean> storagesView();
}
