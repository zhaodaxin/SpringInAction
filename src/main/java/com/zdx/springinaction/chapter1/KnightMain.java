package com.zdx.springinaction.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/chapter1/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
