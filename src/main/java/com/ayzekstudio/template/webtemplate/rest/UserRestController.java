package com.ayzekstudio.template.webtemplate.rest;

import com.ayzekstudio.template.webtemplate.dao.UserDAO;
import com.ayzekstudio.template.webtemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserDAO userDao;

	@Autowired
	public UserRestController() {
	}
	
	// expose "/employees" and return list of employees
	@GetMapping("/user")
	public List<User> findAll() {
		return userDao.findAll();
	}

	
}










