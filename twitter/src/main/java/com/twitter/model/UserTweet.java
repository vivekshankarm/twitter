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
	private String parentId;
	
//	public UserTweet(String userTweet) {
//		this.userTweet = userTweet;
//	}
	
	public UserTweet() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public UserTweet(String userTweet, String parentId) {
		this.userTweet = userTweet;
		this.parentId = parentId;
	}
	
	public UserTweet(String userTweet) {
		this.userTweet = userTweet;
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
	public String getParent_id() {
		return parentId;
	}
	public void setParent_id(String parent_id) {
		this.parentId = parent_id;
	}
	
	@Override
	public String toString() {
		return "UserTweet [id=" + id + ", userTweet=" + userTweet + ", parentId=" + parentId + "]";
	}	
}
