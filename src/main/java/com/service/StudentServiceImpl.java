package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.dao.StudentEntity;

import net.bytebuddy.asm.Advice.Return;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public StudentEntity save(StudentEntity entity) {	
		   return   studentDao.save(entity);
	}	
	@Override
	 public List<StudentEntity> fetchAll(){
           List<StudentEntity> entities=studentDao.findAll();	         	        	      
		         return entities;		   
	}
	
	@Override
	public StudentEntity editById(int id) {   
		   Optional<StudentEntity> optional=studentDao.findById(id);
		   if(optional.isPresent()) {
			   StudentEntity entity=optional.get();
			   return entity;
		   }
		   return null;
	}
	
	@Override
	public StudentEntity update(StudentEntity entity) {	
		   return   studentDao.save(entity);
	}	
}
