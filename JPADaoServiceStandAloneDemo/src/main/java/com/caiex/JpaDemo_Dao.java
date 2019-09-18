package com.caiex;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.caiex.hibernate.model.Student;
import com.caiex.repository.CaiRepository;
import com.caiex.service.StudentService;
import com.caiex.service.StudentServiceImpl;
import com.caiex.config.AppConfig;


/**
 * Class used to perform CRUD operation on database with Hibernate API's
 * 
 */
public class JpaDemo_Dao {	
	
//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		JpaDemo_Dao application = new JpaDemo_Dao();
		
		Student s1 = application.saveStudent("Cross1", "Zheng1", "Physics1");
		Student s2 = application.saveStudent("Cross2", "Zheng2", "Physics2");
	    
		StudentService srv1 = new StudentServiceImpl();
		
//	    new StudentServiceImpl().save(s1);
		srv1.save(s1);
	    System.out.println("-- " + s1.getFirstName());
		
//	    new StudentServiceImpl().save(s2);
	    srv1.save(s2);
	    System.out.println("-- " + s2.getFirstName());
	}


	
	
	
	
	
	public Student saveStudent(String firstName, String lastName, String section) {

		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setSection(section);	

		return student;
	}
	
	
	
//	/**
//	 * This method saves a Student object in database
//	 * entityManagerFactory should be declared in AppConfig with:
//	 * entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
//	 * entityManagerFactory should be initialized in the main method, with:
//	 * ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//	 * entityManagerFactory = (EntityManagerFactory) applicationContext.getBean("getEMF");
//	 */
//	
//	public void saveStudent1(String firstName, String lastName, String section) {
//
//		Student student = new Student();
//		student.setFirstName(firstName);
//		student.setLastName(lastName);
//		student.setSection(section);
//		
//		
//		// Session session = HibernateUtil.getSessionFactory().openSession();
////		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		// session.beginTransaction();
//		entityManager.getTransaction().begin();
//		
//		// int id = (Integer) session.save(student);
//		entityManager.persist(student);
//		// session.getTransaction().commit();
//		entityManager.getTransaction().commit();
//		
//		System.out.println("-- student persist: " + student.getFirstName() + " --");
//		entityManager.close();	
//	}
	
	
	
	
	
//	/**
//	 * This method returns list of all persisted Student objects/tuples from
//	 * database
//	 */
//	public List<Student> getAllStudents() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//
//		@SuppressWarnings("unchecked")
//		List<Student> employees = (List<Student>) session.createQuery(
//				"FROM Student s ORDER BY s.firstName ASC").list();
//
//		session.getTransaction().commit();
//		return employees;
//	}
//
//	/**
//	 * This method updates a specific Student object
//	 */
//	public void updateStudent(int id, String section) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//
//		Student student = (Student) session.get(Student.class, id);
//		student.setSection(section);
//		//session.update(student);//No need to update manually as it will be updated automatically on transaction close.
//		session.getTransaction().commit();
//	}
//
//	/**
//	 * This method deletes a specific Student object
//	 */
//	public void deleteStudent(int id) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//
//		Student student = (Student) session.get(Student.class, id);
//		session.delete(student);
//		session.getTransaction().commit();
//	}
	
}
