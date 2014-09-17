package ru.memori.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.memori.model.Card;
import ru.memori.model.Deck;


public class GenericCardService implements CardService {
	
	protected CardDao cardDao;

	public Card createNewCard(String question, String answer, Deck deck) {
		Card card = new Card(question, answer);
		card.setDeck(deck);
		cardDao.create(card);
		return card;
	}

	public Card attachCardToDeck(Card card, Deck deck) {
		card.setDeck(deck);
		cardDao.create(card);
		return card;
	}

	public Card getCardById(long id) {
		return cardDao.getOne(id);
	}

	public void updateCard(Card card) {
		cardDao.update(card);
	}

	public void removeCard(Card card) {
		cardDao.remove(card);
	}

	public void viewCard(Card card) {
		card.incrementViews();
		card.setLastTime(new Date());
		cardDao.update(card);
	}
	
	public List<Card> getCardsFiltered(Deck deck, Filter<Card> filter) {
		
		List<Card> filtered = new ArrayList<Card>();
		for (Card card : deck.getCards()) {
			if (filter.accept(card))
				filtered.add(card);
		}
		return filtered;
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}
}
