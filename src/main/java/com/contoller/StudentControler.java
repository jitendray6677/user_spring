package com.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentServce;


@RestController
public class StudentControler {
	@Autowired
	private StudentServce Interfaced;
	//@PostMapping("/auth")
	@GetMapping("/auth")
	public void save( Student student) {
		student.setId(51);
		student.setName("vivo");
		student.setAge(10);
		student.setAddress("vivo");
		Interfaced.save(student);
		
	}
	/*
	 * @GetMapping("/fetch") public void fetchAll(Model model) {
	 * System.out.println("@@@@@@@@@@@@@"); List<Student>
	 * students=Interfaced.fetchAll(); model.addAttribute("massage", students);
	 * System.out.println(students);
	 * 
	 * }
	 */
}
