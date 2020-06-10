package com.project.servlets;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.java.UserDetails;
import com.project.daoimpl.UserDetailsDAOImpl;

/**
 * Servlet implementation class LoginRegisterSrevlet
 */
//@WebServlet("/login")

//author - Murari.Mandala

public class LoginRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginRegisterServlet() {
        // TODO Auto-generated constructor stub
    }

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 UserDetailsDAOImpl sd=new UserDetailsDAOImpl();
	 String uName =request.getParameter("username");
	 String pass =request.getParameter("password1");
	 String submitType =request.getParameter("submit");
	 String keepSignIn =request.getParameter("keepSignIn");
	/* System.out.println( "userName"+uName);
	 System.out.println("pass"+pass);
	 System.out.println("submitType"+submitType);*/
	 System.out.println("keepSignIn :"+keepSignIn);
	 UserDetails st=new UserDetails();
	

	 if(submitType.equals("login") && uName!=null && pass!=null && keepSignIn!=null) {
		 st=sd.getUserDetails(uName, pass);
		 if(st.getFirstName()==null) {
			 request.setAttribute("message", "Invalid username or password !");
			 request.getRequestDispatcher("userLogin.jsp").forward(request, response);
		 }
	//     System.out.println("firstname : "+st.getFirstName()+"<br> lastname :"+st.getLastName()+"<br> passWord :"+st.getPassWord()+"<br> Address :"+st.getAdddress()+"<br> PhoneNo :"+st.getPhoneNo());
		 request.setAttribute("message",st.getFirstName());
		 request.getRequestDispatcher("jsp/welCome.jsp").forward(request, response);
		 
	 }else if(submitType.equals("register")){
		 st=new UserDetails();
		 Random idGenerate=new Random();
		 int UserId=idGenerate.nextInt(1000);
		 st.setUserId(UserId);
		 st.setFirstName(request.getParameter("first_name"));
		 st.setLastName(request.getParameter("last_name"));
		 st.setPassWord(request.getParameter("password"));
		 st.setAdddress(request.getParameter("address"));
		 st.setPhoneNo(request.getParameter("contact"));
		 
		/* System.out.println("StudentId"+StudentId);
		 System.out.println(request.getParameter("first_name"));
		 System.out.println(request.getParameter("last_name"));
		 System.out.println(request.getParameter("password"));
		 System.out.println(request.getParameter("address"));
		 System.out.println(request.getParameter("contact"));*/
	    sd.insertUser(st);
		
			request.setAttribute("sucessMessage", "Successfully registered Plz Login to continue !");
			 request.getRequestDispatcher("userLogin.jsp").forward(request, response);
				
		
		 
		 
	 }else if(submitType.equals("Reset Password")) {
		 String phNo=request.getParameter("phoneNo");
		 String pswd=request.getParameter("rpassword");
		 
		 System.out.println("phNo :"+phNo+"pswd"+pswd);
		 
		
	//	 int status= sd.forgotPassword(request,response,phNo,pswd);
		 sd.forgotPassword(request,response,phNo,pswd);
		
		/*	if(status==0){
				 request.setAttribute("failuerMessage", "Plz enter a valid phone no !");
				 request.getRequestDispatcher("forgotPass.jsp").forward(request, response);
					
			}else {*/
				request.setAttribute("sucessMessage", "Your password was successfully resetted plz login to continue !");
				 request.getRequestDispatcher("userLogin.jsp").forward(request, response);
				 			
	//		}
		 
		 
		  
	 }else {
		 request.getRequestDispatcher("userLogin.jsp").forward(request, response);
	 }
	  
	 
 }

}
