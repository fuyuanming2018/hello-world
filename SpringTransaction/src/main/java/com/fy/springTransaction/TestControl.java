package com.fy.springTransaction;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fy.springTransaction.service.TestAB;
import com.fy.springTransaction.service.TestService;
import com.fy.springTransaction.service.TestServiceB;

@Controller
@RequestMapping(value = "/test")
public class TestControl {
	
	private static Logger logger=Logger.getLogger(TestControl.class);
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestServiceB testServiceB;
	
	@Autowired
	private TestAB testAB;
	
	@RequestMapping(value = "/ww.do")
	@ResponseBody
	@Transactional(rollbackFor=Exception.class)
	public void test() throws Exception {
		logger.info("方法test");
		/*testService.add();
		testServiceB.B();*/
		testAB.ab();
		normal();
	}
	
	public void normal() throws Exception{
		testAB.ab();
		throw new Exception();
	}
	
	
}
