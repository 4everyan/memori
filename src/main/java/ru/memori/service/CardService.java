package ru.memori.service;

import ru.memori.model.Card;
import ru.memori.model.Deck;


public interface CardService {

	Card createNewCard(String question, String answer, Deck deck);
	Card attachCardToDeck(Card card, Deck deck);
	Card getCardById(long id);
	
	void updateCard(Card card);
	void removeCard(Card card);
	void viewCard(Card card);
}
