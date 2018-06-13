package com.example.dao;

import java.util.Collection;
import java.util.List;

/**
 * 接口方法默认public修饰，其属性默认为static final修饰，保持代码简洁，接口方法不再显式声明public。
 * 
 * @description 数据层基础接口
 * @author xinyuan.wei
 * @time 2017年12月21日 上午10:31:27
 */
public interface BaseDao<T> {

	/**
	 * 通用存储方法
	 * 
	 * @param object
	 */
	void save(T object);

	/**
	 * 通用批量存储方法
	 * 
	 * @param object
	 */
	void batchSave(Collection<T> object);

	/**
	 * 通用更新方法
	 * 
	 * @param object
	 */
	void update(T object);

	/**
	 * 通用删除方法
	 * 
	 * @param object
	 */
	void delete(T object);

	/**
	 * 通用查询所有数据方法
	 * 
	 * @return List<T>
	 */
	List<T> getAll();
}
