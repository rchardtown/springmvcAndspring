package cn.ekgc.spring.introductionDemo.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ekgc.spring.introductionDemo.aop.userDao.UserDao;

public class AopDemo {

	// AOP: 面向切面
	// 本质：在不改变源代码的基础上，给程序动态添加新功能的技术
	// 用到的技术： 反向代理、反射机制
	// 本质： 底层将原程序复制，添加新的功能，返回给需要的对象，过程中没有改变源码
	// 如何实现： 需要在xml 如：aop.xml 中进行专门的配置，才能生效

	// 举例： 给saveUser()添加打印日志的功能
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"cn/ekgc/spring/introductionDemo/aop/aop.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.saveUser();
		userDao.show();
	}

}
