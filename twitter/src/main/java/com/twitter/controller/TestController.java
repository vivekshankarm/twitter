package com.twitter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twitter.model.User;
import com.twitter.repository.UserRepository;
import com.twitter.repository.UserTweetRepository;

@Controller
public class TestController {
	
	@Autowired
	UserRepository userRepo;
	@Autowired
	UserTweetRepository userTweetRepo;
	
	@RequestMapping("/test/list/wrp/users")
//	@ResponseBody
	public List<User> getUsersWithoutResponseBody() {
		System.out.println("hit the method getUsersWithoutResponseBody");
		// it will throw error 404 ResponseBody work is to tell the output is JSON
		return userRepo.findAll();
	}
	
	@RequestMapping("/test")
//	@ResponseBody
	public String test() {
		return userRepo.findAll().toString();
	}
	
	@RequestMapping("/test/users")
	@ResponseBody
	public String getUsers() {
		// it will throw error 404 ResponseBody work is to tell the output is JSON
		return userRepo.findAll().toString();
	}
	
	@RequestMapping("/test/list/users")
	@ResponseBody
	public List<User> getUsersList() {
		return userRepo.findAll();
	}
	
	@RequestMapping("/test/user/{id}")
	@ResponseBody
	public Optional<User> getUserById(@PathVariable("id") int id) {
		return userRepo.findById(id);
	}
	
}
