package com.org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.UserDao;
@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		
		UserDao dao = new UserDao();
		
		dao.deleteUserById(id);
		
		resp.sendRedirect("home1.jsp");
		
		
		

		
	}

}
