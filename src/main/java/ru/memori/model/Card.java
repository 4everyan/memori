package ru.memori.model;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;


public class Card extends Entity implements Serializable {
	
	private static final long serialVersionUID = -5748440040966487693L;
	
	private String question;
	private String answer;
	
	public static final int STATE_LEARN = 0;
	public static final int STATE_REVIEW = 1;
	public static final int STATE_EXAMINE = 2;
	
	/**
	 * card review specific settings
	 */
	private Date lastTime;
	private Date nextTime;
	private int views;
	private int stage;
	private int state = STATE_LEARN;
	
	/**
	 * many-to-one relationship;
	 * [many] of Cards are related to [one] Deck
	 */
	@Expose
	private Deck deck;
	
	public Card() {}	
	public Card(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public Date getNextTime() {
		return nextTime;
	}

	public void setNextTime(Date nextTime) {
		this.nextTime = nextTime;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}
	
	public void incrementViews() {
		views++;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
