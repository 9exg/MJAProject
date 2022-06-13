package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.TestService;

@Controller
public class TestController {
	
	@Autowired 
	private TestService testService;
	
	// @GetMapping : Get방식으로 통신 하겠다. query parameter 방식으로 data를 주고받겠다. 일반적으로 select에 사용.
	@GetMapping ("/")
	public String home() {
		//리턴할 페이지 명
		return "index" ; 
	}
	
	@GetMapping ("/main")
	public String main() {
		//리턴할 페이지 명
		return "main" ; 
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public List <HashMap<String, Object>> findAll() {
		
		return testService.findAll();
	}

	// http://localhost:8081/selectOne?params=1
	@GetMapping("/selectOne")
	@ResponseBody
	public HashMap<String, Object> selectOne(int params){
		
		return testService.selectOne(params);
	}
}
