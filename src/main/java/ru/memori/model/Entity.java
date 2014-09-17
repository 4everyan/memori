package ru.memori.model;


public abstract class Entity {
	
	private long id = -1;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
