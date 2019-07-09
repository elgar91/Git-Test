package com.bit.team3.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.team3.model.dao.ProductBoardMapper;
import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;

@Service("ProductBoardService")
public class ProductBoardServiceImpl implements ProductBoardService {
	private static final Logger logger = LoggerFactory.getLogger(ProductBoardServiceImpl.class);
	@Autowired
	ProductBoardMapper productBoardMapper;

	@Override
	public List<ProductBoardBean> getAllList() {
		List<ProductBoardBean> beans = productBoardMapper.getAllProductList();
		logger.info("beans==>" + beans);
		return beans;
	}

//	@Override
//	public void doProductWrite() {
//		// TODO Auto-generated method stub
//		ProductBoardBean beans = productBoardMapper.doWrite();
//	}

	@Override
	public void doProductWrite(ProductBoardBean bean) {
		// TODO Auto-generated method stub
		productBoardMapper.doWrite(bean);
		
	}

	@Override
	public ProductBoardBean getViewList() {
		// TODO Auto-generated method stub
		
		
		return productBoardMapper.getProductReviewList();
	}

	@Override
	public void productView(ProductBoardBean dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductBoardBean detailView(int productBoardNo) {
		return productBoardMapper.detailView(productBoardNo);
	}

	@Override
	public void modifyView(ProductBoardBean dto) {
		productBoardMapper.modifyView(dto);
		
	}

	@Override
	public ProductBoardOrderBean getOrderInfo(int productBoardNo, String nickName) {
		// TODO Auto-generated method stub
		Map<String, Object> order = new HashMap<String, Object>();
		order.put("productBoardNo", productBoardNo);
		order.put("nickName", nickName);
		
		return productBoardMapper.getOrderInfo(order);
		
		
	}

	@Override
	public void productDelete(int productBoardNo) {
		// TODO Auto-generated method stub
		productBoardMapper.productDelete(productBoardNo);
		
	}


//	@Override
//	public void doProductWrite() {
//		// TODO Auto-generated method stub
//		ProductBoardBean beans = productBoardMapper.doWrite();
//	}
	
	@Override
	public List<ProductBoardBean> desksView() {
		return productBoardMapper.desksView();
		
	}

	@Override
	public List<ProductBoardBean> shelvesView() {
		return productBoardMapper.shelvesView();
		
	}

	@Override
	public List<ProductBoardBean> screensView() {
		return productBoardMapper.screensView();
		
	}

	@Override
	public List<ProductBoardBean> storagesView() {
		return productBoardMapper.storagesView();
		
	}


	
	
}