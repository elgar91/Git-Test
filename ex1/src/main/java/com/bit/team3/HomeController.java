package com.bit.team3;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.service.MainProductService;
import com.bit.team3.model.service.ProductBoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MainProductService mainProductService;
	
	@RequestMapping("/")
	public String ProductList(Model model) {
		List<ProductBoardBean> newProduct = mainProductService.getNewProduct();
		model.addAttribute("newProduct", newProduct);
		/*
		 * List<ProductBoardBean> productBoardAll = productBoardService.getAllList();
		 * logger.info("productBoardAll : " + productBoardAll);
		 * model.addAttribute("productBoardAll", productBoardAll);
		 */
		return "index";
	}
	
}
