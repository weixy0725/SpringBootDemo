package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dao.ExampleDao;
import com.example.dao.impl.ExampleDaoImpl;

/**
 * @description 数据层配置类
 * @author xinyuan.wei
 * @time 2017年12月21日 下午3:00:12
 */
@Configuration
public class DaoConfig {

	@Bean
	public ExampleDao getExampleDao() {
		return new ExampleDaoImpl();
	}

}
