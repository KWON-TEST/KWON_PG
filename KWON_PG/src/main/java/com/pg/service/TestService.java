package com.pg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.dao.TestDao;
import com.pg.model.TestModel; 

@Service 
public class TestService {
	@Autowired 
	public TestDao dao; 
	
	public TestModel selectTest() { 
		TestModel test = dao.selectTest();
		
		return test;
	} 
}
