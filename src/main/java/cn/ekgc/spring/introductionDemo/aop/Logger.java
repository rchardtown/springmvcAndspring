package cn.ekgc.spring.introductionDemo.aop;

public class Logger {
	public void beforeLoger() {
		System.out.println(" before saveUser()方法。。。");
	}
	public void afterLogger() {
		System.out.println("after saveUser() 方法 ");
	}
}
