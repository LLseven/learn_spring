package com.ll.learn.spring.h_aop_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("h-aop-xml-beans.xml");
		
		UserDao userDao = (UserDao) ctx.getBean(UserDao.class);
		
		userDao.add("id", "name");

//		userDao.add("id", null);
	}

}
