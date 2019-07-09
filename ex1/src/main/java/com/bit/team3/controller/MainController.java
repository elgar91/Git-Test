package com.bit.team3.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.bit.team3.model.dto.ProductBoardBean;

import com.bit.team3.model.service.MainProductService;


@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	MainProductService mainProductService;

	//@RequestMapping("productList")
	public String newProduct(Model model) {
		List<ProductBoardBean> newProduct = mainProductService.getNewProduct();
		model.addAttribute("newProduct", newProduct);
		return "product/productList";
	}	
}
