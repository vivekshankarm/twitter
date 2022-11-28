package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.model.UserTweet;

@Repository
public interface UserTweetRepository extends JpaRepository<UserTweet,Integer>{
	
}
