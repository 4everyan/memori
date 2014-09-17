package ru.memori.model;

import java.util.ArrayList;
import java.util.List;


public class Schedule {

	private List<Interval> learnIntervals;
	private List<Interval> reviewIntervals;

	public Schedule() {
		
		this.learnIntervals = new ArrayList<Interval>();
		this.reviewIntervals = new ArrayList<Interval>();
		
		learnIntervals.add(new Interval(1, Interval.MINUTES));
		learnIntervals.add(new Interval(10, Interval.MINUTES));
		
		reviewIntervals.add(new Interval(1, Interval.DAYS));
		reviewIntervals.add(new Interval(2, Interval.DAYS));
		reviewIntervals.add(new Interval(3, Interval.DAYS));
		reviewIntervals.add(new Interval(6, Interval.DAYS));
	}
}
