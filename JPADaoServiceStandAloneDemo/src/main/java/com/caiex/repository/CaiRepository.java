package com.caiex.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.caiex.hibernate.model.Student;


public interface CaiRepository extends JpaRepository<Student, Long> {

//	@Transactional
//	Student save(Student student);
	List<Student> findById(Integer id);
}
