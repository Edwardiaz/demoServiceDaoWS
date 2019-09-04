package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.InterfaceGenericDao;

@Service
public class GenericServiceImpl implements IGenericService{

	private InterfaceGenericDao interGd;
	
	@Autowired
	public GenericServiceImpl(InterfaceGenericDao interGd) {
		this.interGd = interGd;
	}
	
	@Override
	public void genericSave(Object obj) {
		interGd.genericSave(obj);
	}

}
