package com.kevincylee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kevincylee.demo.entity.User;
import com.kevincylee.demo.service.UserService;

/**
 * ClassName: Controller
 * 
 * @author Chen Yuan Lee (Kevin)
 * @version 1.0
 * @createTime: 2018/07/15 20:42:52
 */

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
