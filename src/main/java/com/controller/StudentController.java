package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.StudentDao;
import com.dao.StudentEntity;
import com.service.StudentService;

//import com.dao.StudentDao;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/auth")
	public String tests() {
		return "wel";
	}
	@PostMapping("/register")
	public String save(@ModelAttribute StudentEntity entity) {
		    service.save(entity);
			return "hello";
	}
	
	@GetMapping("/showAll")
	public String fetchAll(Model model) {
		   List<StudentEntity> student=service.fetchAll();
		   model.addAttribute("student", student);
		   return "showAll";
	}
      @GetMapping("/editPage")
      public String findById(@RequestParam int id,Model model) {
    	  StudentEntity entity=service.editById(id);
    	  model.addAttribute("entity", entity);
		return "edit";
      }
      @PostMapping("/update")
  	public String update(@ModelAttribute StudentEntity entity) {
  		    service.update(entity);
  			return "redirect:showAll";
  	}
}
