package com.caiex.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caiex.model.Student;

@Repository
public interface CaiRepository extends JpaRepository<Student, Long> {

	@Transactional
	Student save(Student student);
	
//	List<Student> findById(int id);
//	List<Student> findByLastName(String lastName);
}
