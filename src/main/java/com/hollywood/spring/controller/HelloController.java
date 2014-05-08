package com.hollywood.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("welcome")
	public String loadHomePage(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		// return the name of the view 
		return "hello";
	}
}
