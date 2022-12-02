package com.twitter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twitter.model.UserTweet;
import com.twitter.repository.PageRepository;

@Controller
public class PageController {
	
	@Autowired
	PageRepository pageRepo;
	
	@RequestMapping("/page/{index}")
	@ResponseBody
	public List<UserTweet> findPaginated(@PathVariable ("index") Integer index) {
		
		Pageable firstPage = PageRequest.of(index, 3);
		return pageRepo.findAll(firstPage).toList();
	}
}
