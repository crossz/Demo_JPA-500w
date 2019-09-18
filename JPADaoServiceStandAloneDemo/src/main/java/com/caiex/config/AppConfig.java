package com.caiex.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.caiex.repository.CaiRepository;

@Configuration
@ComponentScan(basePackages={"com.caiex"})
public class AppConfig
{
//	private EntityManagerFactory entityManagerFactory;
//
//	@Bean
//	public EntityManagerFactory getEntityManagerFactory() {
//		try{
//		// sessionFactory = new Configuration().configure().buildSessionFactory();
//			entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
//		}catch (Throwable ex) {
//			System.err.println("EntityManager Factory could not be created." + ex);
//			throw new ExceptionInInitializerError(ex);
//		}
//		return entityManagerFactory;
//	}
	
	
	
	
	
/*
 * JPA parts
 */
	
//    @Value("${entitymanager.packages.to.scan}")
//    private String ENTITYMANAGER_PACKAGES_TO_SCAN;
//	
//	
//	
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
//        entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
//        entityManagerFactoryBean.setJpaProperties(hibernateProperties());
//        return entityManagerFactoryBean;
//    }
//	@Bean
//    public BasicDataSource dataSource() {
//
////        DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        dataSource.setDriverClassName(PROPERTY_NAME_DATABASE_DRIVER);
////        dataSource.setUrl(PROPERTY_NAME_DATABASE_URL);
////        dataSource.setUsername(PROPERTY_NAME_DATABASE_USERNAME);
////        dataSource.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setUrl(PROPERTY_NAME_DATABASE_URL);
//        basicDataSource.setUsername(PROPERTY_NAME_DATABASE_USERNAME);
//        basicDataSource.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
//        basicDataSource.setDriverClassName(PROPERTY_NAME_DATABASE_DRIVER);
//        basicDataSource.setInitialSize(100);
//        return basicDataSource;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//
//        return new HibernateJpaVendorAdapter();
//    }
//
//
//    private Properties hibernateProperties() {
//
//        Properties properties = new Properties();
//        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, HIBERNATE_DIALECT);
//        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, HIBERNATE_SHOW_SQL);
//        properties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL, HIBERNATE_HBM2DDL);
//        //<property name="connection.autoReconnect">true</property>　
//        properties.put(PROPERTY_NAME_AUTO_RECONNECT, HIBERNATE_AUTO_RECONNECT);
//        return properties;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager() {
//
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//        return transactionManager;
//    }

	
	
	
	
		
	
}
	
	

