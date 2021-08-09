package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Factorial {
																																																																																																					
			

@GetMapping("/hello")																										
public String zee() {																																																																																								
	return "hello";
}																								
	@GetMapping("/fact")
	public String factorial(@RequestParam int num,Model model) {
		int fact=1;
		
	//	Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			fact=i*fact;
	//	int	number=fact;
			
		}
		System.out.println(fact);
		model.addAttribute("message", fact);
		return "hello";
		
	}
	
}
