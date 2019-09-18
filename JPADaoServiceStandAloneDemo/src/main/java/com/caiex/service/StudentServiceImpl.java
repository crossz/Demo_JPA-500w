package com.caiex.service;

import com.caiex.dao.StudentDao;
import com.caiex.dao.StudentDaoImpl;
import com.caiex.hibernate.model.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao = new StudentDaoImpl();

	@Override
	public void save(Student student) {
		studentDao.save(student);
		
	}

}
