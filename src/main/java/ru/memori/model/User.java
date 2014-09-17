package ru.memori.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class User extends Entity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4335185909159898536L;
	private String name;
	private String passwordHash;
	private String authorities;

	/**
	 * many-to-one relationship;
	 * [many] of Decks are related to [one] User
	 */
	private Set<Deck> decks = new HashSet<Deck>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public Set<Deck> getDecks() {
		return decks;
	}

	public void setDecks(Set<Deck> decks) {
		this.decks = decks;
	}
}
