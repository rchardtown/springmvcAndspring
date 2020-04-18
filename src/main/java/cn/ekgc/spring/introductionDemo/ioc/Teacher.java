package cn.ekgc.spring.introductionDemo.ioc;

public class Teacher {

	private String username;
	private int age;

	public Teacher(String username ,int age) {
		System.out.println("teachaer name is " + username);
		System.out.println("teachaer age is " + age);
		
		this.username = username;
		this.age = age;
	}

}
