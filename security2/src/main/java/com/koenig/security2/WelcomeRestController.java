package com.koenig.security2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getmsg() {
		
		String msg ="Welcome to koenig";
		return msg;
		
	}

}
