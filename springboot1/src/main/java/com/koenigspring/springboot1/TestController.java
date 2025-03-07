package com.koenigspring.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class TestController {
	
	@RequestMapping("/test")
	public String firstHandler() {
		return "Happy Birthday Vedika Jain";
		
	}
}
