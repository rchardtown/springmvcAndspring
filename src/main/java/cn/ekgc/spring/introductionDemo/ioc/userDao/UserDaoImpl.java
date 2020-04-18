package cn.ekgc.spring.introductionDemo.ioc.userDao;

import java.util.Date;

public class UserDaoImpl implements UserDao {
	@Override
	public void userSave() {
		System.err.println("userDao 存储 user " + new Date());
	};

}
