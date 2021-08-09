package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alertModel.AlertModel;
@RestController
public class AlertController {

	@GetMapping("/fetchAll")
	public List<AlertModel> fetch() {
		List<AlertModel> list=new ArrayList<AlertModel>();
	//public List<String> fetch() {
	//	List<String> list=new ArrayList<String>();
		//list.add("")
		
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");
		
		  String sql="select * from student_tbl"; PreparedStatement
		  pstmt=conn.prepareStatement(sql); 
		  ResultSet rs= pstmt.executeQuery();
	
		  while(rs.next()) {
				/*
				 * int id= rs.getInt("id"); // System.out.println(id); String
				 * name=rs.getString("name"); int age=rs.getInt("age"); String
				 * address=rs.getString("address");
				 */ // System.out.println(id+ " name :"+name+"  age :"+age+ "  address :"+address);
			  String name=rs.getString("name");
			  String address=rs.getString("address");
			  System.out.println(rs.getString("id"));
			  int id=rs.getInt("id");
			  int age=rs.getInt("age");
				/*
				 * list.add("name : "+name); list.add("address : "+address);
				 * list.add("id : "+id); list.add("age : "+a);
				 */
			  
			 
		 //  AlertModel  aa=new AlertModel(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getString("address"));
			//  AlertModel  aa=new AlertModel(rs.getInt("age"),rs.getString("address"));
			  AlertModel a=new AlertModel(rs.getString("name"));
		   list.add(a);
		   
		  }
		  }
			/*
			 * catch (SQLException ex ) { ex.printStackTrace(); // TODO: handle exception
			 * 
			 * }
			 */ catch (Exception e) {
		
		e.printStackTrace();
		
				}
	return list;
	
}
	
	@GetMapping("/zeee")
	public String ze() {
		String str=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");
		
		  String sql="select * from student_tbl order by name=name"; PreparedStatement
		  pstmt=conn.prepareStatement(sql); 
		 
		  ResultSet rs= pstmt.executeQuery();
	
		  while(rs.next()) {
			  int id=rs.getInt("id");
			  String name=rs.getString("name");
			  int age=rs.getInt("age");
			  String address=rs.getString("address");
			  System.out.println(id+ " name :"+name+"  age :"+age+ "  address :"+address);
			  str=rs.getString("name");
		  }
		 
				} catch (Exception e) {
		
		e.printStackTrace();
	
	}return str;
	}
}
