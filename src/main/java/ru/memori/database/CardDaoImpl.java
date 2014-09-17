package ru.memori.database;

import ru.memori.model.Card;
import ru.memori.service.CardDao;

public class CardDaoImpl extends HibernateDao<Card> implements CardDao {
	
	public CardDaoImpl() {
		setClazz(Card.class);
	}
}
