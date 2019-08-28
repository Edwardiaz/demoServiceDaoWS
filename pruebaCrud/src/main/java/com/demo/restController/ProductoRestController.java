package com.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Products;
import com.demo.service.ProductoServiceImpl;

@RestController
public class ProductoRestController {
	
	private ProductoServiceImpl proService;
	
	@Autowired
	public ProductoRestController(ProductoServiceImpl proService) {
		this.proService = proService;
	}
	
	@RequestMapping(value = "/producto", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Products> getProducts() {
        List<Products> list = proService.findAll();
        return list;
    }
}
