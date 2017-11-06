package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.model.UserModel;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(UserModel userModel) {
		System.out.println("添加用户");
	}

}
