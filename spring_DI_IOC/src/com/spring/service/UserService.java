package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.model.UserModel;

public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(UserModel userModel) {
		userDao.save(userModel);
	}
}
