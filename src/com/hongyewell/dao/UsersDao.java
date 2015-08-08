package com.hongyewell.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hongyewell.db.DBUtil;
import com.hongyewell.model.Users;

/**
* @className:UsersDao.java
* @classDescription:
* @author:yeye
* @createTime:2015年8月8日 下午4:36:37
*/
public class UsersDao {
	
	
	/**
	 * 添加一个用户
	 *
	 * @author: yeye
	 * @createTime: 2015年8月8日 下午5:59:28
	 * @history:
	 * @param u
	 * @throws Exception void
	*/
	public void addUsers(Users u) throws Exception{
		Connection conn = DBUtil.getConnection();
		String sql = ""
				+ "insert into t_users"
				+ "(username,password,isdel)"
				+ "values("
				+ "?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ps.setInt(3, u.getIsdel());
		ps.execute();
		
	}
	
	
	/**
	 * 更新用户信息
	 *
	 * @author: yeye
	 * @createTime: 2015年8月8日 下午8:51:57
	 * @history:
	 * @param u
	 * @throws SQLException void
	*/
	public void updateUsers(Users u) throws SQLException{
		Connection conn = DBUtil.getConnection();
		String sql = ""
				+ " update t_users"
				+ " set username=?,password=?,isdel=?"
				+ " where id=?";
				
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ps.setInt(3, u.getIsdel());
		ps.setInt(4, u.getId());
		ps.execute();
		
	}
	
	
	
	/**
	 * 删除用户信息
	 *
	 * @author: yeye
	 * @createTime: 2015年8月8日 下午8:52:33
	 * @history:
	 * @param id
	 * @throws SQLException void
	*/
	public void delUsers(Integer id) throws SQLException{
		Connection conn = DBUtil.getConnection();
		String sql = ""
				+ " delete from t_users"
				+ " where id=?";
				
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
	}
	
	
	
	/**
	 *查询一组用户
	 *
	 * @author: yeye
	 * @createTime: 2015年8月8日 下午5:38:47
	 * @history:
	 * @return
	 * @throws Exception List<Users>
	*/
	public List<Users>query() throws Exception{
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs =stmt.executeQuery("select * from t_users ");
		
		List<Users> us = new ArrayList<Users>();
		Users u = null;		
		while(rs.next()){
			u = new Users();
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			
			us.add(u);
		}
		return us;
		
	}
	
	
	/**
	 * 查询一个用户
	 *
	 * @author: yeye
	 * @createTime: 2015年8月8日 下午5:40:14
	 * @history:
	 * @return Users
	 * @throws SQLException 
	*/
	public Users get(Integer id) throws SQLException{
		Users u = null;
		Connection conn = DBUtil.getConnection();
		String sql = ""
				+ " select * from t_users"
				+ " where id=?";
				
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			u = new Users();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			u.setIsdel(rs.getInt("isdel"));
		}
		return u;
	}
}
