package ru.memori.service;

import ru.memori.model.User;


public interface UserDao extends GenericDao<User> {
	
	User getByName(String name);
}
