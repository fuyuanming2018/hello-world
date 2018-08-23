package com.fy.springTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
      //  ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        
        //获取bean
      /*  TestBean tb = (TestBean) context.getBean("testBean");
        tb.sayHello();*/
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext();
        
	}
}
