package com.atlunk.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 使用 Thymeleaf注意事项
 * 此处不能直接使用@RestController，会默认反json
 * 要跳转页面需要使用 @Controller
 * http://localhost:8080 默认会跳转到classpath:/public/index.html
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping("/success")
	public String success(Map<String, Object> map) {
		//classpath:/templates/success.html
		map.put("hello", "<h1>你好</h1>");
		map.put("users", Arrays.asList("zhansan", "lisi", "wangwu"));
		return "success";
	}
	
}
