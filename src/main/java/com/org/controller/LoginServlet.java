package com.org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.UserDao;
import com.org.dto.User;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDao dao= new UserDao();
		
		User user = dao.fetchUserByEmailAndPassword(email, password);
		
		HttpSession session = req.getSession();
		
		System.out.println(user);
		
		
		
		if(user.getName()!=null) {
			
			session.setAttribute("userObj", user);
			resp.sendRedirect("home1.jsp");
		}
		
		else {
			
			session.setAttribute("msg", "Invalid Credentials");
			resp.sendRedirect("login1.jsp");
			
		}
		

	}
	
}
