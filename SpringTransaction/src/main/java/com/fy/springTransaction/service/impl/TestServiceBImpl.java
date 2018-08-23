package com.fy.springTransaction.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fy.springTransaction.service.TestServiceB;

@Service
public class TestServiceBImpl implements TestServiceB{
	
	@Override
//	@Transactional
	public void B() throws Exception {
		throw new Exception();
	}
	
}