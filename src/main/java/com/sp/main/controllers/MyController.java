package com.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sp.main.entities.User;

@Controller
public class MyController {
	@GetMapping("/order")
	 public String openOrderPage() {

		 return"order";
	 }
}
