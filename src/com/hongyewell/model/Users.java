package com.hongyewell.model;
/**
* @className:Users.java
* @classDescription:
* @author:yeye
* @createTime:2015年8月8日 下午4:18:12
*/
public class Users {
	
	private Integer id;
	private String username;
	private String password;
	private Integer isdel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", isdel=" + isdel + "]";
	}
	
	

}
