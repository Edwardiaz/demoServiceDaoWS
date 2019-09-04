package com.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Products;
import com.demo.service.IGenericService;

@RestController
public class GenericController {

	private IGenericService interGs;
	
	@Autowired
	public GenericController(IGenericService interGs) {
		this.interGs = interGs;
	}
	
	@RequestMapping(value = "/pro", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void genericSave(@RequestBody Products pro) {
		interGs.genericSave(pro);
	}
}
