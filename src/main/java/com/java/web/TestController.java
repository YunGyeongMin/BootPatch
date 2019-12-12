package com.java.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	Map<String, String> map;
	
	@RequestMapping(path="/post", method = RequestMethod.POST)
	public @ResponseBody Map<String, String> post(@RequestBody User user) {
		System.out.println("post()");
		return sendToMap(user);
	}
	
	@RequestMapping(path="/patch", method = RequestMethod.PATCH)
	public @ResponseBody Map<String, String> patch(@RequestBody User user) {
		System.out.println("patch()");
		return sendToMap(user);
	}
	
	public Map<String, String> sendToMap(User user){
		System.out.println(user.toString());
		map = new HashMap<String, String>();
		map.put("ID", user.getId());
		map.put("PW", user.getPw());
		return map;
	}
	
}
