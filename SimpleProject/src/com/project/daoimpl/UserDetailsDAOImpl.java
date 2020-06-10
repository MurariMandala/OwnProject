package com.project.daoimpl;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnection.MyConnectionProvider;
import com.entities.java.UserDetails;
import com.project.dao.UserDAO;

//author - Murari.Mandala

public class UserDetailsDAOImpl implements UserDAO {

	static Connection conn;
	static PreparedStatement ps;
	
	@Override
	public int insertUser(UserDetails stu) {
      
		int status=0;
		
		try {
			conn=MyConnectionProvider.getConn();
	//		System.out.println(conn);
			String insertQuery="Insert into user_details(USER_ID,FIRST_NAME,LAST_NAME,USER_PASS,USER_ADDRESS,USER_PHNO) values(?,?,?,?,?,?)";
			ps=conn.prepareStatement(insertQuery);
			ps.setInt(1, stu.getUserId());
			ps.setString(2, stu.getFirstName());
			ps.setString(3, stu.getLastName());
			ps.setString(4, stu.getPassWord());
			ps.setString(5, stu.getAdddress());
			ps.setString(6, stu.getPhoneNo());
			
			status = ps.executeUpdate();
			if(status!=0) {
				System.out.println("DataBase Connected");
				System.out.println("Record Inserted");
			}
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}

	@Override
	public UserDetails getUserDetails(String userName, String passWord) {
		
		UserDetails st=new UserDetails();
try {
	conn=MyConnectionProvider.getConn();
	String selectQuery="select * from user_details where FIRST_NAME=? and USER_PASS=?";
	ps=conn.prepareStatement(selectQuery);
	ps.setString(1, userName);
	ps.setString(2, passWord);
	ResultSet rs=ps.executeQuery();
	//System.out.println(rs);
	while (rs.next()) {
		st.setFirstName(rs.getString(2));
		st.setLastName(rs.getString(3));
		st.setPassWord(rs.getString(4));
		st.setAdddress(rs.getString(5));
		st.setPhoneNo(rs.getString(6));
		
	
	}
	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return st;
	}
	@Override
	public int forgotPassword(HttpServletRequest req,HttpServletResponse res ,String phNo, String pswd) {
		int status=0;
		try {
			conn=MyConnectionProvider.getConn();
			String resetQuery="UPDATE user_details SET USER_PASS = ? WHERE USER_PHNO = ?";
			
			ps=conn.prepareStatement(resetQuery);
			ps.setString(1, pswd);
			ps.setString(2, phNo);
			
			status=ps.executeUpdate();
			
			
			if(status==0) {
				 req.setAttribute("failuerMessage", "Plz enter a valid phone no !");
				 req.getRequestDispatcher("forgotPass.jsp").forward(req, res);
						}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
		
	}

}
