package com.service;

import java.util.List;

import com.dao.StudentEntity;

public interface StudentService {

	StudentEntity save(StudentEntity entity);

	List<StudentEntity> fetchAll();

	StudentEntity editById(int id);

	StudentEntity update(StudentEntity entity); 

}
