package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping("/message")
	//@ResponseBody
	public String message(Model model) {
		model.addAttribute("name", "<h1>John</h1>");
		List<Integer> scores = Arrays.asList(100, 40, 70, 55); 
		model.addAttribute("scores", scores);
		return "message";
	}
	
}
