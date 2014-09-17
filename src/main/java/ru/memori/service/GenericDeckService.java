package ru.memori.service;

import org.springframework.beans.factory.annotation.Autowired;

import ru.memori.model.Deck;
import ru.memori.model.User;


public class GenericDeckService implements DeckService {
	
	protected DeckDao deckDao;

	public DeckDao getDeckDao() {
		return deckDao;
	}

	@Autowired
	public void setDeckDao(DeckDao deckDao) {
		this.deckDao = deckDao;
	}

	public Deck createBlankDeck(String title, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Deck attachDeckToUser(Deck deck, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeDeck(Deck deck) {
		// TODO Auto-generated method stub
	}

	public void learnDeck(Deck deck) {
		// TODO Auto-generated method stub
	}
}
