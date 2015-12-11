package com.dataart.example.controllers;

import com.dataart.example.domain.User;
import com.dataart.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String info(ModelMap model)
	{
		User user = service.find();
		model.put("user", user);
		return "info";
	}
	
	@RequestMapping("/create")
	public String create()
	{
		User user = new User("User1", "pass", "Ivan Ivanov");
		service.save(user);
		return "redirect:/";
	}
	
	@RequestMapping("/picture.htm")
	public String picture()
	{
		return "picture";
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}
}
