package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.ExampleService;
import com.example.service.impl.ExampleServiceImpl;

/**
 * @description 业务层配置类
 * @author xinyuan.wei
 * @time 2017年12月21日 下午3:00:41
 */
@Configuration
public class ServiceConfig {
	
	@Bean
	public ExampleService getExmapleService() {
		return new ExampleServiceImpl();
		
	}

}
