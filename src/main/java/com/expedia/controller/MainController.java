package com.expedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String welcome() {//Welcome page, non-rest
		return "index";
	}
}
