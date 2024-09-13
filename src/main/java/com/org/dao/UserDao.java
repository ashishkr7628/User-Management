package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.dto.User;

public class UserDao {
	
	
	public void save(User user) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("insert into user(name,age,email,password,mobile) values(?,?,?,?,?)");
			
			stmt.setString(1, user.getName());
			stmt.setInt(2, user.getAge());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			stmt.setLong(5, user.getMobile());
			
			stmt.executeUpdate();
			
			con.close();
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public User fetchUserById(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("select * from user where id=?");
			
			stmt.setInt(1,id);
			
			
			User user= new User();
			
			ResultSet rst = stmt.executeQuery();
			if(rst.next()){
				
				int userId = rst.getInt("id");
				String name = rst.getString("name");
				int age = rst.getInt("age");
				String email1 = rst.getString("email");
				String password1 = rst.getString("password");
				long mobile= rst.getLong("mobile");
				
				user.setId(userId);
				user.setName(name);
				user.setAge(age);
				user.setEmail(email1);
				user.setPassword(password1);
				user.setMobile(mobile);
				
			}
			
			
			
			con.close();
			
			return user;
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
	
	
	
	
	
	public List<User> fetchAllUsers(){
		
		
		
		
		
		
		
		
		try {
			
			
			List<User> list = new ArrayList<>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("select * from user");
			
		
			
			
			
			
			ResultSet rst = stmt.executeQuery();
			while(rst.next()){
				User user= new User();
				int userId = rst.getInt("id");
				String name = rst.getString("name");
				int age = rst.getInt("age");
				String email1 = rst.getString("email");
				String password1 = rst.getString("password");
				long mobile= rst.getLong("mobile");
				
				user.setId(userId);
				user.setName(name);
				user.setAge(age);
				user.setEmail(email1);
				user.setPassword(password1);
				user.setMobile(mobile);
				
				list.add(user);
				
				
			}
			System.out.println(list);
			
			
			con.close();
			
			return list;
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
		
		
	
	
	public void updateUserById(int id, User user) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("update user set name=?, age=?,email=?, mobile=? where id="+id+"");
			
			stmt.setString(1, user.getName());
			stmt.setInt(2, user.getAge());
			stmt.setString(3, user.getEmail());
			
			stmt.setLong(4, user.getMobile());
			
			stmt.executeUpdate();
			
			con.close();

			
			
			
			con.close();
			
		
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
			
			
			
			
		
		
		
		
		
		
	
	
	
	public void deleteUserById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("delete from user where id=?");
			
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
		
		

			
			
			
			con.close();
			
		
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
			
			
			
		
		
		
		
		
		
		
		
		
	
	
	
	public User fetchUserByEmailAndPassword(String email, String password) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("select * from user where email=? and password=?");
			
			stmt.setString(1,email);
			stmt.setString(2, password);
			
			User user= new User();
			
			ResultSet rst = stmt.executeQuery();
			if(rst.next()){
				
				int userId = rst.getInt("id");
				String name = rst.getString("name");
				int age = rst.getInt("age");
				String email1 = rst.getString("email");
				String password1 = rst.getString("password");
				long mobile= rst.getLong("mobile");
				
				user.setId(userId);
				user.setName(name);
				user.setAge(age);
				user.setEmail(email1);
				user.setPassword(password1);
				user.setMobile(mobile);
				
			}
			
			
			
			con.close();
			
			return user;
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
	
	
	
	
	public List<User> searchUser(String name1){
		
try {
			
			
			List<User> list = new ArrayList<>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
			PreparedStatement stmt = con.prepareStatement("select * from user where name=?");
			
			stmt.setString(1, name1);
			
		
			
			
			
			
			ResultSet rst = stmt.executeQuery();
			while(rst.next()){
				User user= new User();
				int userId = rst.getInt("id");
				String name = rst.getString("name");
				int age = rst.getInt("age");
				String email1 = rst.getString("email");
				String password1 = rst.getString("password");
				long mobile= rst.getLong("mobile");
				
				user.setId(userId);
				user.setName(name);
				user.setAge(age);
				user.setEmail(email1);
				user.setPassword(password1);
				user.setMobile(mobile);
				
				list.add(user);
				
				
			}
			System.out.println(list);
			
			
			con.close();
			
			return list;
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
		
		
		
		
		
		
		
		
	}
	}


