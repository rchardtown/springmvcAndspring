package cn.ekgc.spring.introductionDemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ekgc.spring.introductionDemo.ioc.userService.UserService;
import cn.ekgc.spring.introductionDemo.ioc.userService.UserServiceImpl;

public class UserDemo {
	private static String pathString = "cn/ekgc/spring/introductionDemo/ioc/ioc.xml";

	public static void main(String[] args) {
//		UserService userService = new UserServiceImpl();
		// 启动spring
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(pathString);
		// 获得serviceImpl对象
		UserService userService = (UserService) applicationContext.getBean("userService");
		//对象调用方法
		userService.saveUser();
//		
		//测试seteter 方法依赖注入
		
		User user =(User)applicationContext.getBean("user");
		user.show();
		
		
		//测试构造方法的 的依赖注入
		Teacher teacher =(Teacher) applicationContext.getBean("teacher");
	
		// 笔记：
		 // 肯定构造方法依赖注入的效率会更快，毕竟是构造方法注入
		
	}
}
