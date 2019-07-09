package com.bit.team3.model.dao;

import java.util.List;
import java.util.Map;

import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;

public interface MainProductMapper {
	List<ProductBoardBean> getNewProduct();
}
