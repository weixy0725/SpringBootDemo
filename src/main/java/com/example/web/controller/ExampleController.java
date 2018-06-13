package com.example.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ExampleService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @description 示例controller
 * @author xinyuan.wei
 * @time 2017年12月20日 下午4:06:19
 */
@RestController
@RequestMapping(value = "/example")
public class ExampleController {

	private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);
	
	@Autowired
	private ExampleService exampleService;

	@RequestMapping(value = "/example", method = RequestMethod.POST)
	public JSONObject example(@RequestParam(name = "name") String name) {
		JSONObject data = new JSONObject();
		JSONObject result = new JSONObject();
		JSONObject object = new JSONObject();
		JSONArray array = new JSONArray();
		try {
			exampleService.save(name);
			result.put("code", 0);
			result.put("info", "");
			result.put("developInfo", "");
			LOG.error("提交{}成功", name);

		} catch (Exception e) {
			result.put("code", 1);
			result.put("info", "提交失败");
			result.put("developInfo", e.fillInStackTrace().toString());
			LOG.error("提交失败：", e.fillInStackTrace());
		}
		data.put("result", result);
		data.put("object", object);
		data.put("array", array);
		return data;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String eurekaTest() {
		return "hello";
	}
}
