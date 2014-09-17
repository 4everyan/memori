package ru.memori.database;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public abstract class HibernateDao<T extends Serializable> {
	
	private SessionFactory sessionFactory;
	protected Class<T> clazz;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	@SuppressWarnings("unchecked")
	public T getOne(long id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return (List<T>) getCurrentSession().createCriteria(clazz).list();
	}

	public void create(T entity) {
		getCurrentSession().persist(entity);
	}

	public T update(T entity) {
		getCurrentSession().update(entity);
		return entity;
	}

	public void remove(T entity) {
		getCurrentSession().delete(entity);
	}

	public void removeById(long id) {
		T entity = getOne(id);
		remove(entity);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
