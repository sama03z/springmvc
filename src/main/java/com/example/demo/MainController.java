package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/1")
	public String index1() {
		return "First Project - Winter is comming!";
	}
	
	@RequestMapping("/2")
	public String index2() {
		return "Second Project - Winter is comming!";
	}
}
