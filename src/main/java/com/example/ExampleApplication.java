package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 此处将包含main函数的类放置于顶层 的com.example包中，{@code @SpringBootApplication}可以定义隐式的包搜索路径。
 * {@code @Configuration},{@code @EnableAutoConfiguration}{@code @ComponentScan}
 * 此处同时使用以上三个注解等同于{@code @SpringBootApplication}
 * 将包含main函数的类放在顶层包中，{@code @EnableAutoConfiguration}可以隐式的定义基础的包搜索路径，以搜索注解实体，
 * 则使用@{@code ComponentScan}就不需要指定basePackage属性了。
 * 
 * @description SpringBoot启动类
 * @author xinyuan.wei
 * @time 2017年12月20日 下午3:59:19
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
}
