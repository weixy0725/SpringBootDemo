package com.example.dao.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.example.dao.BaseDao;

/**
 * 设置 rollbackFor = Exception.class，对抛出异常的事务进行回滚。
 * 
 * @description 数据层基础实现
 * @author xinyuan.wei
 * @time 2017年12月21日 下午2:43:29
 */
@Transactional(rollbackFor = Exception.class)
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public void save(T object) {
		Session session = sessionFactory.getCurrentSession();
		session.save(object);

	}

	@Override
	public void batchSave(Collection<T> object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T object) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
