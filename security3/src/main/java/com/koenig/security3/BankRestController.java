package com.koenig.security3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/home")
	public String home() {
		String msg ="Welcome to Bank";
		return msg;
	}
	@GetMapping("/balance")
	public String getbalance() {
		String msg ="your current balance is 5000";
		return msg;
	}
	@GetMapping("/statement")
	public String getStmt() {
		String msg ="your statement is sent to your email";
		return msg;
	}
	@GetMapping("/myloan")
	public String getMyLoan() {
		String msg ="your loan amount is due to 50000";
		return msg;
	}
	@GetMapping("/contact")
	public String contact() {
		String msg ="THank you for contacting customer support , we will get you back";
		return msg;
	}
}
