package com.hari.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.classific.classification.Classification;
import com.hari.classific.service.ClassService;
import com.hari.classific.service.impl.ClassServiceImpl;



public class Main {

	public static void main(String[] args) {
	
 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		ClassService classService = (ClassService) ctx.getBean("classService", ClassServiceImpl.class);

		Classification classification = new Classification();
		classification.setClassName("AuthorName");
		
		classService.addClassification(classification);

	}

}
