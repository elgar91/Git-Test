package com.bit.team3.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.team3.model.dto.ProductBoardBean;
import com.bit.team3.model.dto.ProductBoardOrderBean;
import com.bit.team3.model.service.ProductBoardService;

@Controller
public class ProductBoardController {
	private static final Logger logger = LoggerFactory.getLogger(ProductBoardController.class);

	@Autowired
	ProductBoardService productBoardService;

//	@Autowired
//	private SqlSession sqlSession;

	@RequestMapping("/productList")
	public String ProductList(Model model) {
		List<ProductBoardBean> productBoardAll = productBoardService.getAllList();
//		ProductBoardService productBoardService = sqlSession.getMapper(ProductBoardService.class); 
		logger.info("productBoardAll : " + productBoardAll);
//		model.addAttribute("allProductList", productBoardService.getAllList());
		model.addAttribute("productBoardAll", productBoardAll);
		return "product/productList";
	}

	@RequestMapping ("productView")
	public String detailCall(int productBoardNo, Model model) {
		ProductBoardBean dto = productBoardService.detailView(productBoardNo);
		logger.info("dto : " + dto);
		model.addAttribute("dto", dto);
		return "product/productView";
		
	}

	// product 페이지로 넘어가는 곳
	@RequestMapping("productModify")
	private String modifyCall(int productBoardNo, Model model) {
		ProductBoardBean dto = productBoardService.detailView(productBoardNo);
		logger.info("dto : " + dto);
		model.addAttribute("dto", dto);
		return "product/productModify";
	}

	// productSuccess 페이지로 넘어가는 곳
	@RequestMapping("productModifySuccess")
	private String modifySuccessCall(ProductBoardBean dto) {
		productBoardService.modifyView(dto);
		return "redirect:productView?productBoardNo=" + dto.getProductBoardNo();
	}

	@RequestMapping("/sendWrite")
	public String sendWrite() {
		return "product/productWrite";

	}

	@RequestMapping("/doProductWrite")
	public String productWrite(ProductBoardBean beans, Model model) throws Throwable, IOException {
		Map<String, String> fileName = new HashMap<String, String>();

		fileName.put("file01", beans.getFile01().getOriginalFilename());
		fileName.put("file02", beans.getFile02().getOriginalFilename());
		fileName.put("file03", beans.getFile03().getOriginalFilename());
		for (String key : fileName.keySet()) {

			logger.info("fileName" + String.format("file : %s,  beans.getFile01().getOriginalFilename() : %s", key,
					fileName.get(key)));
		}

		String fileName1 = "empty1";
		String fileName2 = "empty2";
		String fileName3 = "empty3";
		if (fileName.containsKey("file01") && fileName.containsKey("file02") && fileName.containsKey("file03")) {

			 fileName1 = fileName.get("file01") +"-"+System.currentTimeMillis();
			 fileName2 = fileName.get("file02") +"-"+System.currentTimeMillis();
			 fileName3 = fileName.get("file03") +"-"+System.currentTimeMillis();

			String path = "D:\\st3_web_work\\ex1\\src\\main\\webapp\\resources\\profileImage\\";
			beans.getFile01().transferTo(new File(path + fileName1));
			beans.getFile02().transferTo(new File(path + fileName2));
			beans.getFile03().transferTo(new File(path + fileName3));
						
		}
		beans.setPicUrl1(fileName1);
		beans.setPicUrl2(fileName2);
		beans.setPicUrl3(fileName3);
		
		productBoardService.doProductWrite(beans);


		return "redirect:/productList";
	}

	@RequestMapping("/sendView")
	public String sendView(Model model) {
		ProductBoardBean productViewDtos = productBoardService.getViewList();
		model.addAttribute("productViewDtos", productViewDtos);

		logger.info("productViewDtos : " + productViewDtos);
		logger.info("productViewModel : " + model);

		return "product/productView";
	}

	@RequestMapping("/sendOrder")
	public String sendOrder(@RequestParam("nickName") String nickName,
			@RequestParam("productBoardNo") int productBoardNo, Model model) {

		logger.info("@RequestParam(\"nickName\") : " + nickName);
		logger.info("@RequestParam(\"productBoardNo\") : " + productBoardNo);
//		logger.info("ProductBoardOrderBean : " + productOrderInfoDtos);

		ProductBoardOrderBean productOrderInfoDtos = new ProductBoardOrderBean();
		productOrderInfoDtos = productBoardService.getOrderInfo(productBoardNo, nickName);
		model.addAttribute("productOrderInfodtos", productOrderInfoDtos);
		logger.info("productOrderInfodtos : " + model);

//		ProductBoardBean productViewDtos = productBoardService.getOrderInfo(model);
//		

		return "product/productOrder";
	}

	@RequestMapping("productDelete")
	public String productDelete(int productBoardNo) {
		logger.info("productDelete-productBoardNo : " + productBoardNo);

		productBoardService.productDelete(productBoardNo);

		return "redirect:productList";
	}
	
	@RequestMapping("/desks")
	private String desksView(Model model) {
		List<ProductBoardBean> list = productBoardService.desksView();
		model.addAttribute("productBoardAll",list);
		model.addAttribute("number",1000);
		return "product/productList";
	}
	
	@RequestMapping("/shelves")
	private String shelvesView(Model model) {
		List<ProductBoardBean> list = productBoardService.shelvesView();
		model.addAttribute("productBoardAll",list);
		model.addAttribute("number",2000);
		return "product/productList";
	}
	@RequestMapping("/screens")
	private String screensView(Model model) {
		List<ProductBoardBean> list = productBoardService.screensView();
		model.addAttribute("productBoardAll",list);
		model.addAttribute("number",3000);
		return "product/productList";
	}
	
	@RequestMapping("/storages")
	private String storagesView(Model model) {
		List<ProductBoardBean> list = productBoardService.storagesView();
		model.addAttribute("productBoardAll",list);
		model.addAttribute("number",4000);
		return "product/productList";
	}

}