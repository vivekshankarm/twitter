package com.twitter.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.twitter.model.UserTweet;

public interface PageRepository extends JpaRepository<UserTweet, Integer>{
	
	
}
