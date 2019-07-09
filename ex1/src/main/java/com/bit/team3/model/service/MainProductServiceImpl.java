package com.bit.team3.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.team3.model.dao.MainProductMapper;
import com.bit.team3.model.dao.ProductBoardMapper;
import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;

@Service("MainProductService")
public class MainProductServiceImpl implements MainProductService {
	private static final Logger logger = LoggerFactory.getLogger(MainProductServiceImpl.class);
	@Autowired
	MainProductMapper mainProductMapper;


	@Override
	public List<ProductBoardBean> getNewProduct() {
		List<ProductBoardBean> beans = mainProductMapper.getNewProduct();
		logger.info("beans==>" + beans);
		return beans;
	}



	
	
}