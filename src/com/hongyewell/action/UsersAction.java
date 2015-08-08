package com.hongyewell.action;

import java.util.List;

import com.hongyewell.dao.UsersDao;
import com.hongyewell.model.Users;

/**
* @className:UsersAction.java
* @classDescription:
* @author:yeye
* @createTime:2015年8月8日 下午5:27:39
*/
public class UsersAction {
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * 查询一组用户
		UsersDao u = new UsersDao();
		List<Users> us = u.query();
		for (Users users : us) {
			System.out.println(users.getUsername()+","+users.getPassword());
		}*/
		
		
		
		/*
		 * 添加用户
		UsersDao u = new UsersDao();
		Users u1 = new Users();
		
		u1.setUsername("CCLSOL实验室");
		u1.setPassword("123456");
		u1.setIsdel(1);
		
		u.addUsers(u1);*/
		
		
		
		/*
		 * 更新用户信息
		UsersDao u = new UsersDao();
		Users u1 = new Users();
		
		u1.setUsername("安徽农业大学");
		u1.setPassword("1234");
		u1.setIsdel(1);
		u1.setId(6);
		
		u.updateUsers(u1);*/
		
		
		/*
		 * 删除用户8
		UsersDao u = new UsersDao();		
		u.delUsers(8);*/
		
		
		
		/*
		 * 查询单个用户
		UsersDao u = new UsersDao();		
		Users u2 =u.get(1);
		System.out.println(u2.toString());*/
		
		
	}

}
