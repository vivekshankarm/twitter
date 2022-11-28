package com.twitter.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.twitter.model.User;
import com.twitter.repository.UserRepository;
import com.twitter.repository.UserTweetRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	@Autowired
	UserTweetRepository userTweetRepo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("hit login");
		return "login";
	}
	
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(User user,HttpSession session) {
		userRepo.save(user);
		ModelAndView mv = new ModelAndView("userHome");
//		mv.addObject("user",user);
		
		session.setAttribute("user",user);
//		userTweetRepo.findAll();
		return mv;
	}
	
//	@RequestMapping("/test")
//	@ResponseBody
//	public String test() {
//		
//		return userRepo.findAll().toString();
//	}
//	
//	@RequestMapping("/test1")
//	@ResponseBody
//	public List<User> test1() {
//		
//		return userRepo.findAll();
//	}
}
