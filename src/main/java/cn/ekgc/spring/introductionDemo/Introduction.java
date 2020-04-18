package cn.ekgc.spring.introductionDemo;

public class Introduction {
// spring 是一个轻量级的企业级框架
	//编程方式：spring是面向bean 的编程
	//特点：
		// Ioc 容器   ：控制反转（一切基于程序员来说的，以前时程序员通过类创建对象，对象的控制权在程序员身上（类身上），
					// 有了spring后，通过spring的配置文件来自动的创建对象，程序员需要要什么对象，直接通过对象的id 向spring要来用就行。
					//  权限反转了）
					//   DI 在 spring 创建对象时，经常产生：
						//  spring 创建对象，底层肯定调用构造方法，此时，可以设置属性的初始值，
						//  我们把spring 在创建对象时设定属性初始值的 动作称为 ：依赖注入（DI）
						//  依赖注入：属性初始值设置
	
	
		// AOP 实现:源代码的基础是给程序添加动态功能的技术
			// 在不更改
		//	附加的： 1.借助于mybatis,通过spring操作mybatis
		//			2.集成了web 开发
	//核心配置文件：
		//管理bean 的一个xml文件

	public void sayHello() {
		System.out.println("hello ,你好 ！");
	}
	
}
