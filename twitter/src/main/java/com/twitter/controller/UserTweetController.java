package com.twitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.twitter.model.UserTweet;
import com.twitter.repository.UserTweetRepository;

@Controller
public class UserTweetController {
	
	@Autowired
	UserTweetRepository userTweetRepo;
	
//	@RequestMapping("/userTweetAction")
//	public ModelAndView userTweet(UserTweet userTweet) {
//		
//		System.out.println("hit the userTweet method");
//		System.out.println("tweet is " + userTweet.getUserTweet());
//		userTweetRepo.save(userTweet);
//		ModelAndView mv = new ModelAndView("userHome");
//		return mv;
//	}
	
	@RequestMapping("/userTweetAction")
	public ModelAndView userTweet(@RequestParam("userTweet")String userTweet,@RequestParam("parentId")String parentId) {
		
		System.out.println("hit the userTweet method");
		System.out.println("userTweet value is " + userTweet);
		UserTweet userTweetObj = new UserTweet(userTweet);
		userTweetRepo.save(userTweetObj);
		ModelAndView mv = new ModelAndView("userHome");		
		return mv;
	}
	
	@RequestMapping("/userTweetAction/{comment}/{pk}")
	@ResponseBody
	public List<UserTweet> updateComment(@PathVariable("comment")String comment, @PathVariable("pk")String pk) {
		System.out.println("comment " + comment);
		System.out.println("pk " + pk);
		
		UserTweet userTweetObj = new UserTweet(comment,pk);
		System.out.println("userTweetObj " + userTweetObj);
		userTweetRepo.save(userTweetObj);
		
		return userTweetRepo.findAll();
	}
}
