package com.fy.springTransaction.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fy.springTransaction.dao.TestDao;
import com.fy.springTransaction.domain.Test;
import com.fy.springTransaction.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	public void A() {
		Map<String,Object> param=new HashMap<String,Object>();
		List<Test> findDate = testDao.findDate(param);
		for(Test test:findDate) {
			System.out.println(test.getName());
		}
	}

	@Override
	//@Transactional
	public void add() {
		Test test=new Test();
			 test.setName("测试");
			 test.setRemark("备注");
			 test.setSex(1);
		testDao.add(test);
	}
	
}
