package cn.ekgc.spring.introductionDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		
		// 启动spring 框架
		
		// 通过ClassPathFXmlApplicationContext 启动
		// ClassPath:类路径、src/main/java/
		// XML:指的是给spring核心配置文件配置的格式为xml,如 beans.xml
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"cn/ekgc/spring/introductionDemo/beans.xml");
		// spring 框架启动后，beans.xml中的bean 也就创建了一个个对应的对象
		// 通过bean 的id拿去需要用到的对象
		Introduction introduction = (Introduction) applicationContext.getBean("introduction");
		// 使用对象调用方法
		introduction.sayHello();// hello ,你好 ！
	}
}
