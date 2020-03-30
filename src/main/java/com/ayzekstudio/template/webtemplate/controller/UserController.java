package com.ayzekstudio.template.webtemplate.controller;

import com.ayzekstudio.template.webtemplate.dao.UserDAO;
import com.ayzekstudio.template.webtemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	private UserDAO userDao;

	public UserController() {
	}
	
	@GetMapping("/")
	public ModelAndView listAllUsers() {
		ModelAndView theModel = new ModelAndView("admin/user/user-list");

		List<User> userList = userDao.findAll();
		theModel.addObject("userList", userList);

		return theModel;
	}

	
}










