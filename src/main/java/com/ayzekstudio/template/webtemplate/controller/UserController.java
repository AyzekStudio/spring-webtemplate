package com.ayzekstudio.template.webtemplate.controller;

import com.ayzekstudio.template.webtemplate.dao.UserRepository;
import com.ayzekstudio.template.webtemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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

	@GetMapping("/create")
	public ModelAndView createUser(){
		ModelAndView theModel = new ModelAndView("admin/user/user-view");
		return theModel;
	}

	@PostMapping("/create")
	public ModelAndView saveNewUser(@PathVariable String username){
		ModelAndView theModel = new ModelAndView("admin/user/user-view");

		User user = userRepository.findByUsername(username);
		theModel.addObject("user", user);

		return theModel;
	}

	@GetMapping("/{username}")
	public ModelAndView showUser(@PathVariable String username){
		ModelAndView theModel = new ModelAndView("admin/user/user-view");

		User user = userRepository.findByUsername(username);
		theModel.addObject("user", user);
		theModel.addObject("disabled", true);

		return theModel;
	}

	@GetMapping("/{username}/edit")
	public ModelAndView editUser(@PathVariable String username){
		ModelAndView theModel = new ModelAndView("admin/user/user-view");

		User user = userRepository.findByUsername(username);
		theModel.addObject("user", user);

		return theModel;
	}

	@PostMapping("/{username}/edit")
	public ModelAndView updateUser(@PathVariable String username){
		ModelAndView theModel = new ModelAndView("admin/user/user-view");

		User user = userRepository.findByUsername(username);
		theModel.addObject("user", user);

		return theModel;
	}

	@GetMapping("/{username}/delete")
	public RedirectView deleteUser(@PathVariable String username){
		userRepository.deleteByUsername(username);
		return new RedirectView("admin/user/user-list");
	}
	
}










