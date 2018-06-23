package com.kevincylee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kevincylee.demo.entity.User;
import com.kevincylee.demo.service.UserService;

@RestController
public class Controller {

	@Autowired
	UserService service;

	@GetMapping("/")
	private ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> users = service.findAll();
		modelAndView.addObject("users", users);
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
