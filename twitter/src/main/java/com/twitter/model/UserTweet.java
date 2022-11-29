package com.twitter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class UserTweet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userTweet;
	private Integer parentId;
	private Integer userId;
	
//	public UserTweet(String userTweet) {
//		this.userTweet = userTweet;
//	}
	
	public UserTweet() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public UserTweet(String userTweet, Integer parentId,Integer userId) {
		this.userTweet = userTweet;
		this.parentId = parentId;
		this.userId = userId;
	}
	
	public UserTweet(String userTweet,Integer userId) {
		this.userTweet = userTweet;
		this.userId = userId;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserTweet() {
		return userTweet;
	}
	public void setUserTweet(String userTweet) {
		this.userTweet = userTweet;
	}
	public Integer getParent_id() {
		return parentId;
	}
	public void setParent_id(Integer parent_id) {
		this.parentId = parent_id;
	}
	
	@Override
	public String toString() {
		return "UserTweet [id=" + id + ", userTweet=" + userTweet + ", parentId=" + parentId + "]";
	}	
}
