package ru.memori.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Deck extends Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4544310068464013833L;
	private String title;
	private String description;
	
	/**
	 * many-to-one relationship;
	 * [many] of Decks are related to [one] User
	 */
	private User user;
	
	/**
	 * many-to-one relationship;
	 * [many] of Cards are related to [one] Deck
	 */
	private Set<Card> cards = new HashSet<Card>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
