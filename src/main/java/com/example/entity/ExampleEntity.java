package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @description 测试实体类
 * @author xinyuan.wei
 * @time 2017年12月21日 上午10:25:36
 */
@Entity
@Table(name = "example")
public class ExampleEntity {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;*/
	
	@Id
	@GeneratedValue(generator = "snowFlakeId")
	@GenericGenerator(name = "snowFlakeId", strategy = "com.example.utils.SnowFlakeUtil")
	@Column(name = "id")
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
