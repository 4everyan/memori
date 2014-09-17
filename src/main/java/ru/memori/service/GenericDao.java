package ru.memori.service;

import java.io.Serializable;
import java.util.List;


public interface GenericDao<T extends Serializable> {
	
	T getOne(long id);
	List<T> getAll();
	
	void create(T entity);
	
	T update(T entity);
	
	void remove(T entity);
	void removeById(long entityId);
}
