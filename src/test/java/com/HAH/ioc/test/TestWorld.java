package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.HAH.ioc.HelloWorld;

public class TestWorld {
	
//	This is file system Xml Configuration
//	If you wanna this config, your context.xml file need to enter the file system of project folder.
//	(If context.xml file having in resources, delete or change location)
	@Test
	public void demoTest() {
		var context = new FileSystemXmlApplicationContext("context.xml");
		context.refresh(); 
		var bean = context.getBean(HelloWorld.class);
		bean.getWorld();
	}
}
