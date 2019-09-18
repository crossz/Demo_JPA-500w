package com.caiex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.caiex.config.AppConfig;

import com.caiex.repositories.CaiRepository;
import com.caiex.model.Student;


public class JpaDemo_repository {

	public static void main(String[] args) {	
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
		
		CaiRepository caiRepository = (CaiRepository) ctx.getBean("caiRepository");
		
		
		Student s1 = saveStudent("Cross1", "Zheng1", "Physics1");
		
		caiRepository.save(s1);
	    System.out.println("-- " + s1.getFirstName());
	}	
	
	
	
	public static Student saveStudent(String firstName, String lastName, String section) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setSection(section);	

		return student;
	}
	
	
}
