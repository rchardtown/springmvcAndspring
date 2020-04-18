package cn.ekgc.spring.introductionDemo.aop.userDao.impl;

import cn.ekgc.spring.introductionDemo.aop.userDao.UserDao;

public class UserDaoImpl implements UserDao{
	private String username;

	@Override
	public void saveUser() {
		System.out.println("saveUser()"+"  方法正在执行。。。");
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public void show() {
		System.out.println("username : "+username);
	}

}
