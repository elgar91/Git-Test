package com.bit.team3.model.service;

import java.util.List;

import org.springframework.ui.Model;

import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;


public interface MainProductService {
	List<ProductBoardBean> getNewProduct();
}
