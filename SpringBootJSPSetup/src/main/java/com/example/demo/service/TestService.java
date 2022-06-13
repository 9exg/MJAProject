package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestMapper;

@Service
public class TestService {
	
	@Autowired 
	private TestMapper testMapper;
	
	public List <HashMap<String, Object>> findAll() {	
		return testMapper.findAll();
	}
	
	public HashMap<String, Object> selectOne(int params) {
		return testMapper.selectOne(params);
	}
	

}
