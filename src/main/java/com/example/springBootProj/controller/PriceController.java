package com.example.springBootProj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootProj.model.ProductModel;

@RestController
public class PriceController {
	


	
	@GetMapping("/getPriceList")
	public List<ProductModel> getProductList() {
		
		ProductModel productObj = new ProductModel();
		
		List<ProductModel> productList = new ArrayList<ProductModel>();
		
		productObj.setProductPrice(9);
		
		productList.add(productObj);
		
		return productList;
		
	}
	
}
