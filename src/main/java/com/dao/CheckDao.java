package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.alertModel.CheckModel;

@Repository
public class CheckDao {	
	Logger log=LoggerFactory.getLogger(CheckDao.class);
	/*
	 * public CheckModel check(String Id) { CheckModel model =new CheckModel();
	 * 
	 * try { Class.forName("com.mysql.jdbc.Driver"); Connection conn=
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root"
	 * );
	 * 
	 * String sql="select name and age from student_tbl where  Id=?";
	 * 
	 * PreparedStatement pstmt=conn.prepareStatement(sql); pstmt.setString(1, Id);
	 * 
	 * ResultSet rs= pstmt.executeQuery();
	 */
		//  CheckModel model1 =new CheckModel(rs.getString("id"));
		// model.setId(rs.getString("id"));
		 //public HomeModel getdescription() 
		 //HomeModel home=new HomeModel();
		 //home.setdescription(homeService.findDescription)
		 // return home;
		//  }
		 
		/*
		 * catch (Exception e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * } return model;
		 */
	public String check() { 
	
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");
	
		  String sql="select * from student_tbl "; 
		  PreparedStatement  pstmt=conn.prepareStatement(sql); 
		  ResultSet rs=pstmt.executeQuery();
		  while(rs.next()) {
			  System.out.println(rs.getString("name"));
		  }

	}catch (Exception e) {
	log.error(""+e.getMessage());
	}return null;
		// TODO: handle exception
	}

}
