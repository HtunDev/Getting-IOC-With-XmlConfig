package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.HAH.ioc.HelloWorld;

public class TestWorld {
	
	// This is ClassPathXml Configuration
	// ClassPathXml Configuration support multiple refresh
		@Test
		public void demoTest() {
			var context = new ClassPathXmlApplicationContext("classpath:context.xml");
			context.refresh(); 
			var bean = context.getBean(HelloWorld.class);
			bean.getWorld();
		}
}
