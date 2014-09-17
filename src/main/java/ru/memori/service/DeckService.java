package ru.memori.service;

import ru.memori.model.Deck;
import ru.memori.model.User;

public interface DeckService {
	
	Deck createBlankDeck(String title, User user);
	Deck attachDeckToUser(Deck deck, User user);
	void removeDeck(Deck deck);
	void learnDeck(Deck deck);
}
