package ru.memori.service;

import ru.memori.model.Card;


class ViewCountFilter implements Filter<Card> {
	
	public static final int EQUALS = 0;
	public static final int GRATER = 1;
	public static final int LESS = 2;
	
	private int count;
	private int operation;

	public ViewCountFilter(int count, int operation) {
		this.count = count;
		this.operation = operation;
	}
	
	public static Filter<Card> equalsTo(int count) {
		return new ViewCountFilter(count, EQUALS);
	}
	
	public static Filter<Card> graterThan(int count) {
		return new ViewCountFilter(count, GRATER);
	}
	
	public static Filter<Card> lessThan(int count) {
		return new ViewCountFilter(count, LESS);
	}

	public boolean accept(Card card) {
		if (operation == EQUALS)
			return card.getViews() == count;
		else if (operation == GRATER)
			return card.getViews() > count;
		else if (operation == LESS)
			return card.getViews() < count;
		return false;
	}
}