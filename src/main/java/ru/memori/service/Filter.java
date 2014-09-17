package ru.memori.service;


public interface Filter<E> {

	boolean accept(E card);
}
