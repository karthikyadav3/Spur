package com.spur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spur.model.Product;
import com.spur.service.ProductService;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product/{qrCode}")
	@ResponseBody
	public Product getProductByQRCode(@PathVariable(name="qrCode") String qrCode) {
		return productService.getProductByQRCode(qrCode);
	}
	
}
