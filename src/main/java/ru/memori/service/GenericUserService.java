package ru.memori.service;

import org.springframework.beans.factory.annotation.Autowired;

import ru.memori.model.User;


public class GenericUserService implements UserService {

	protected UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User register(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public User login(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void logout() {
		// TODO Auto-generated method stub
	}
}
