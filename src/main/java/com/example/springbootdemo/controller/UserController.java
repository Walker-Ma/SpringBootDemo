package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	/**
	 * 查询所有用户信息
	 *
	 * @return
	 */
	@RequestMapping(value = "selectAll")
	@ResponseBody
	public List<User> findAllUser() {
		return userService.findAll();
	}

	@RequestMapping(value = "findUserById")
	@ResponseBody
	public User findUserById(Integer id) {
		return userService.findUserById(id);
	}
	
	@RequestMapping(value = "/insertUser")
	public String addUser(User user) {
		Integer id = user.getId();
		String name = user.getName();
		Integer age = user.getAge();
		String email = user.getEmail();
		if(StringUtils.isEmpty(name) && age == null && StringUtils.isEmpty(email)) {
			return "redirect:error";
		}
		if(id != null) {
			userService.editUser(user);
		} else {
			userService.addUser(user);
		}
		return "redirect:userSelect";
	}

	@RequestMapping(value = "/deleteUserById")
	public String deleteUser(Integer id) {
		if (userService.findUserById(id) == null) {
			return "del_failure";
		}
		userService.deleteUserById(id);
		return "redirect:userSelect";
	}


}
