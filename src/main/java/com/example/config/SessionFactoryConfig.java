package com.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot应该是不会自动配置Hibernate的SessionFactory的，它会自动创建一个JPA的{@code EntityManagerFactory}。
 * 使用Hibernate的SessionFactory首先需在application.properties中配置好current_session_context_class
 * 
 * @description Hibernate SessionFactory配置类
 * @author xinyuan.wei
 * @time 2017年12月21日 上午11:14:08 
 */
@Configuration
public class SessionFactoryConfig {

	@Bean  
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
	    return hemf.getSessionFactory();  
	}  
}
