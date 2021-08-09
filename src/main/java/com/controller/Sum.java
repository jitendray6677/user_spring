package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Sum {
	
	@GetMapping("/")																										
	public String z() {																																																																																								
		return "/";
	}
	@GetMapping("/zee")
	public String zee() {
		return "sum";
				
	}
	
	/*
	 * @GetMapping( "/sum") public String sumNumber(@RequestParam String
	 * num1, @RequestParam String num2,Model model) { int i=Integer.parseInt(num1) ;
	 * int j=Integer.parseInt(num2); int result=i+j; model.addAttribute("result",
	 * result); return "sum";
	 * 
	 * }
	 */
  @GetMapping( "/sum")
  public String sumNumber(@RequestParam int  num1, @RequestParam int  num2,Model model) {
	
	int result=num1+num2;
	    model.addAttribute("result", result);
	  return "sum";
	  
  }
}
