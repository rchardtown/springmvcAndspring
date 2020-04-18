package cn.ekgc.spring.introductionDemo.ioc.userService;

import java.util.Date;

import cn.ekgc.spring.introductionDemo.ioc.userDao.UserDao;

public class UserServiceImpl implements UserService {
	// 原来处理方法
	// private UserDao userDao = new UserDaoImpl();
	
	 //利用spring 后，不用new 出对象了，但是此时程序中用到UserDao的一个对象userDao，
	//而 private UserDao userDao 是个啥嘛，只是对下对象的一个引用，
	//没有new  UserDao（），private UserDao userDao啥都不是。
	//所以需要通过注解的方式给private UserDao userDao 添加 new UserDao()：完成private UserDao userDao=new UserDao(),
	//来声明userDao是个啥;
	//这里userDao 作为UserService的一个属性出现，需要一个初始值，而恰巧userService运行依赖于这个属性（java中所有的属性都有初始值的），
	//所以此时的注解也是给Userservice的属性赋初始值，因此又叫UserService的依赖注入
	
	

	private UserDao userDao;
	//解决方法：
	//new的本质是调用构造方法，进行setter赋值，说一直这块可以用用setter方法注入
	//Step 1：创建getter  setter 方法
	public UserDao getUserDao() {return userDao;}
	public void setUserDao(UserDao userDao) {this.userDao = userDao;}
	//step 2: ioc.xml中创建userServiceImpl对象时，依赖注入（给userDao 赋初始值）
	@Override
	public void saveUser() {
		System.out.println("userService 存储数据" + new Date());
		userDao.userSave();
	}

	

	

}
