package com.caiex.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.caiex.JpaDemo_repository;

//import com.caiex.repositories.CaiRepository;

@Configuration
@ComponentScan(basePackages={"com.caiex"})
@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.caiex.repositories")
@EnableJpaRepositories({"com.caiex.repositories"}) // com.caiex.hibernate.model
public class AppConfig{

	
//	private EntityManagerFactory entityManagerFactory;
//	private EntityManager entityManager;

	
    @Value("${hibernate.dialect}")
    private String HIBERNATE_DIALECT;

    @Value("${hibernate.show_sql}")
    private String HIBERNATE_SHOW_SQL;

    @Value("${hibernate.hbm2ddl.auto}")
    private String HIBERNATE_HBM2DDL;

//    @Value("${connection.auto_connection}")
//    private String HIBERNATE_AUTO_RECONNECT;

    @Value("${entitymanager.packages.to.scan}")
    private String ENTITYMANAGER_PACKAGES_TO_SCAN;

    private String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    private String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private String PROPERTY_NAME_HIBERNATE_HBM2DDL = "hibernate.hbm2ddl.auto";
//    private String PROPERTY_NAME_AUTO_RECONNECT = "true";
    private String PROPERTY_NAME_AUTO_RECONNECT = "connection.autoReconnect";


    
    @Bean
    static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("config.properties"));
        return propertySourcesPlaceholderConfigurer;
    }
	
    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setUrl("jdbc:mysql://localhost:3307/testing");
        basicDataSource.setUrl("jdbc:mysql://192.168.1.5:3306/testing");
        basicDataSource.setUsername("cross");
        basicDataSource.setPassword("zheng");
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setInitialSize(100);
        return basicDataSource;
    }
    
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
        entityManagerFactoryBean.setJpaProperties(hibernateProperties());
        return entityManagerFactoryBean;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, HIBERNATE_DIALECT);
        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, HIBERNATE_SHOW_SQL);
        properties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL, HIBERNATE_HBM2DDL);
        //<property name="connection.autoReconnect">true</property>　
//        properties.put(PROPERTY_NAME_AUTO_RECONNECT, HIBERNATE_AUTO_RECONNECT);
        properties.put(PROPERTY_NAME_AUTO_RECONNECT, true);
        return properties;
    }

    @Bean
    public JpaTransactionManager transactionManager() {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }	
    
    
}