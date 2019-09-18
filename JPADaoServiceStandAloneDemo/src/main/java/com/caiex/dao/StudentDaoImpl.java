package com.caiex.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.caiex.hibernate.model.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void save(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		
	}

}
