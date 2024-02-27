package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.HAH.ioc.HelloWorld;

public class TestWorld {
	
//  This is GenericXml Configuration
//  GenericXml Configuration does not support multiple refresh
//	You can see two types(Argument with classpath and default) of GenericXml Configuration.
//	@Test
//	public void demoTest() {
//		var context = new GenericXmlApplicationContext("classpath:context.xml");
//			context.load("classpath:context.xml");
//			context.refresh();
//		var bean = context.getBean(HelloWorld.class);
//		bean.getWorld();
//	}
	@Test
	public void demoTest() {
		var context = new GenericXmlApplicationContext("classpath:context.xml");
		var bean = context.getBean(HelloWorld.class);
		bean.getWorld();
	}
}
