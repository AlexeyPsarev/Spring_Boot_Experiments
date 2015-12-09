package com.dataart.example.controllers;

import com.dataart.example.domain.User;
import com.dataart.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class PageController
{
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	String info(ModelMap model)
	{
		User user = service.find();
		model.put("user", user);
		return "info";
	}
	
	@RequestMapping("/welcome")
	String welcome()
	{
		return "welcome";
	}
}
