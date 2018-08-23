package com.fy.springTransaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fy.springTransaction.service.TestAB;
import com.fy.springTransaction.service.TestService;
import com.fy.springTransaction.service.TestServiceB;

@Service
public class TestABImpl implements TestAB{
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestServiceB testServiceB;

	@Override
	//@Transactional(rollbackFor=Exception.class)
	public void ab() throws Exception {
		testService.add();
		//testServiceB.B();
		//normal();
	}
	
	public void normal()throws Exception {
		throw new Exception();
	}
	
	
}
