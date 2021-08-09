package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.CheckDao;

@Service
public class CheckService{
	@Autowired
	CheckDao dao;
	
	public String checkdata() {
		return dao.check();
		
	}

}
