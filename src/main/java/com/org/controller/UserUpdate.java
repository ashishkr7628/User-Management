package com.org.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.UserDao;
import com.org.dto.User;


@WebServlet("/update")
public class UserUpdate extends HttpServlet {
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
	
		long mobile = Long.parseLong(req.getParameter("mobile"));
		
		
		User user = new User();
		
		user.setName(name);
		user.setAge(age);
		user.setEmail(email);
	
		user.setMobile(mobile);
		
		
		UserDao dao= new UserDao();
		
		dao.updateUserById(id, user);
		
		req.setAttribute("msg", "Profile Updated");
		RequestDispatcher rd = req.getRequestDispatcher("home1.jsp");
		
		rd.forward(req, resp);
		
	
		
		
		
		
		
		
		
		
	
	}
	

}
