package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.dao.StudentEntity;
import com.model.Student;

@Service
public class StudentServiceImpl implements StudentServce{
	@Autowired
	private StudentDao dao;
	
        public void save(Student student) {
        	//we are coping data from  student type into StudentEntity
        	StudentEntity entity=new StudentEntity();
        	BeanUtils.copyProperties(student, entity);
        	dao.save(entity);
        }
        
		/*
		 * public List<Student> fetchAll(){ List<StudentEntity> entities=dao.fetch();
		 * List<Student> list=new ArrayList<Student>(); for(StudentEntity std:entities)
		 * { Student student=new Student(); BeanUtils.copyProperties(std, student);
		 * list.add(student); } return list; }
		 */
}
