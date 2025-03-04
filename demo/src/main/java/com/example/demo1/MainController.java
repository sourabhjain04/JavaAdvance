package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		System.out.println("This is Home page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is my contact page");
		return "contact";
	}


}
