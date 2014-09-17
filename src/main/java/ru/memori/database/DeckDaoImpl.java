package ru.memori.database;

import ru.memori.model.Deck;
import ru.memori.service.DeckDao;


public class DeckDaoImpl extends HibernateDao<Deck> implements DeckDao {
	
	public DeckDaoImpl() {
		setClazz(Deck.class);
	}
}
