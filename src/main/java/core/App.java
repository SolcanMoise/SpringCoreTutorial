package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.models.Universitate;

/**
 * Entry class
 * 
 * @author solcanm
 * @version 1.0
 */
public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("models/universitate.xml");
		
		Universitate loc = (Universitate) context.getBean("universitate");
		System.out.println(loc);
	}

}
