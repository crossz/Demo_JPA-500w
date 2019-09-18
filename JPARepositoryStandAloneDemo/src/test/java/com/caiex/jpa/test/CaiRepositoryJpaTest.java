/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.caiex.jpa.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.caiex.model.Student;
import com.caiex.repositories.CaiRepository;


/**
 * Integration tests for Spring Data JPA {@link AccountRepository}.
 * 
 * @author CrossZ
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class CaiRepositoryJpaTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired 
	private CaiRepository caiRepository;
	
	
//	@Before
//	public void setUp1() {
//		@SuppressWarnings("resource")
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
//		caiRepository = (CaiRepository) ctx.getBean("caiRepository");		
//	}
	

	@Test
	public void savesStudentTest() {
//		Student s1 = saveStudent("Cross1", "Zheng1", "Physics1");
		Student student = new Student();
		student.setFirstName("Cross1");
		student.setLastName("Zheng1");
		student.setSection("Physics1");	
		
		caiRepository.save(student);
		System.out.println("-- " + student.getFirstName());
		assertThat(student.getId(), is(notNullValue()));
	}
	

//	@Test
//	public void findsCustomersAccounts() {
//
//		Customer customer = customerRepository.findOne(1L);
//		List<Account> accounts = accountRepository.findByCustomer(customer);
//
//		assertFalse(accounts.isEmpty());
//		assertThat(accounts.get(0).getCustomer(), is(customer));
//	}
	
}
