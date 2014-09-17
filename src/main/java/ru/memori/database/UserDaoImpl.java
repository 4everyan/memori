package ru.memori.database;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import ru.memori.model.User;
import ru.memori.service.UserDao;


@Transactional
public class UserDaoImpl extends HibernateDao<User> implements UserDao {
	
	public UserDaoImpl() {
		setClazz(User.class);
	}

	public User getByName(String name) {
		
		Session session = getCurrentSession();		
		User user = (User) session.createCriteria(clazz)
			.add(Restrictions.eq("name", name))
			.list().get(0);
		return user;
	}
}
