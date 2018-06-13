package com.example.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.ExampleDao;
import com.example.entity.ExampleEntity;
import com.example.service.ExampleService;

/**
 * @description 业务逻辑层示例实现类
 * @author xinyuan.wei
 * @time 2017年12月21日 下午3:10:13
 */
public class ExampleServiceImpl implements ExampleService {

	private static final Logger LOG = LoggerFactory.getLogger(ExampleServiceImpl.class);

	@Autowired
	public ExampleDao exampleDao;

	@Override
	public void save(String name) {
		ExampleEntity exampleEntity = new ExampleEntity();
		exampleEntity.setName(name);
		exampleDao.save(exampleEntity);
		LOG.info("存储{}成功", name);

	}

}
