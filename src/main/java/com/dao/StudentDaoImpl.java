package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.List;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;

//import org.springframework.jdbc.core.JdbcTemplate;

//import com.model.Student;
import com.service.EnumTest;

@Repository
public class StudentDaoImpl implements StudentDao {
	private static Logger logger = Logger.getLogger(StudentDaoImpl.class);

	
	  @Autowired private JdbcTemplate jdbcTemplate;
	 

	//public void save(StudentEntity entity) {
		/*
		 * try { String query =
		 * "insert into student_tbl(id,name,age,address) values(?,?,?,?)";
		 * Class.forName(EnumTest.server_Driver.getAction()); Connection conn =
		 * DriverManager.getConnection(EnumTest.spring_datasource_url.getAction(),
		 * EnumTest.spring_datasource_username.getAction(),
		 * EnumTest.spring_datasource_password.getAction()); PreparedStatement pstmt =
		 * conn.prepareStatement(query); pstmt.setInt(1, entity.getId());
		 * pstmt.setString(2, entity.getName()); pstmt.setInt(3, entity.getAge());
		 * pstmt.setString(4, entity.getAddress()); pstmt.executeUpdate();
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); logger.error("cnnection error  "+e);
		 */

	//}

//	}

	public void save(StudentEntity entity) {
		String sql = "insert into student_tbl(id,name,age,address) values(?,?,?,?)";
		Object[] data = { entity.getId(), entity.getName(), entity.getAge(), entity.getAddress() };
		jdbcTemplate.update(sql, data);
	}

	public List<StudentEntity> fetch() {
		String sql = "select * from student_tbl";
		List<StudentEntity> entities = jdbcTemplate.query(sql, new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class));

		return entities;

	}

}
