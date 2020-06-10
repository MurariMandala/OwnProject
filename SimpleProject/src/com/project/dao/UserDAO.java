package com.project.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.java.UserDetails;

public interface UserDAO {
    
	public int insertUser(UserDetails user);
	public UserDetails getUserDetails(String userName , String passWord);
//	public int forgotPassword(String phNo, String pswd);
	int forgotPassword(HttpServletRequest req, HttpServletResponse res, String phNo, String pswd);
}
