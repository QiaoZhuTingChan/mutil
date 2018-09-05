package com.jyd.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jyd.multi.bean.User;
import com.jyd.multi.bean.ViewLog;
import com.jyd.multi.service.AllService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring-context.xml");
		AllService allService = (AllService) ctx.getBean("allService");

		App app = new App();
		
		app.saveSuccess(allService);
		app.saveWrong(allService);
	}
	
	public static void saveSuccess(AllService allService) {
		User user = new User();
		user.setName("a");

		ViewLog viewLog = new ViewLog();
		viewLog.setLog("log");
		
		try {
			allService.save(user, viewLog);
			System.out.println("Save OK A!");
		} catch (Exception e) {
			System.out.println("Save Error A!");;
		}	
	}

	public static void saveWrong(AllService allService) {
		User user = new User();
		user.setName("b");

		ViewLog viewLog = new ViewLog();
		viewLog.setLog("hello world");
		
		try {
			allService.save(user, viewLog);
			System.out.println("Save OK B!");
		} catch (Exception e) {
			System.out.println("Save Error B!");
		}	
	}
}
