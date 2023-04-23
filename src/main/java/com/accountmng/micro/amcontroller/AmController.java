package com.accountmng.micro.amcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AmController {
	
	@GetMapping("/check")
	public String check() {
		return "Hey Good morning!!";
	}

	@GetMapping("/wish")
	public String wish() {
		return "I am very happy today";
	}
}


