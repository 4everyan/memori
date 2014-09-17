package ru.memori.service;

import ru.memori.model.User;


public interface UserService {
	
	public User register(String name, String password);
	public User login(String name, String password);
	public void logout();
}
