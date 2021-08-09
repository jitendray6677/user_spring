package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alertModel.CheckModel;
import com.service.CheckService;

@RestController
public class CheckController {
	
	@Autowired
	 CheckService checkService;
	
	@GetMapping("/check")
	public CheckModel check() {
		CheckModel  model=new CheckModel();
		model.setId(checkService.checkdata());		
		return model;
	}

}
