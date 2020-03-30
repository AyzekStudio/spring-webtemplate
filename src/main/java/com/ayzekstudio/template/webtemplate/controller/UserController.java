package com.ayzekstudio.template.webtemplate.controller;

import com.ayzekstudio.template.webtemplate.dao.UserRepository;
import com.ayzekstudio.template.webtemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	public UserController() {
	}
	
	@GetMapping("/")
	public ModelAndView listAllUsers() {
		ModelAndView theModel = new ModelAndView("admin/user/user-list");

		List<User> userList = userRepository.findAll();
		theModel.addObject("userList", userList);

		return theModel;
	}

	
}










