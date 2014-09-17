package ru.memori.model;


public class Interval {
	
	private double interval;
	private long timeUnit;
	
	public static final long SECONDS = 1000;
	public static final long MINUTES = 60 * SECONDS;
	public static final long HOURS = 60 * MINUTES;
	public static final long DAYS = 24 * HOURS;
	public static final long WEEKS = 7 * DAYS;
	
	public Interval(double interval) {
		this.interval = interval;
		this.timeUnit = MINUTES;
	}
	
	public Interval(double interval, long timeUnit) {
		this.interval = interval;
		this.timeUnit = timeUnit;
	}
	
	public Interval(Interval other) {
		this.interval = other.interval;
		this.timeUnit = other.timeUnit;
	}

	public double asSeconds() {
		return interval * timeUnit/SECONDS;
	}
	
	public double asMinutes() {
		return interval * timeUnit/MINUTES;
	}
	
	public double asHours() {
		return interval * timeUnit/HOURS;
	}
	
	public double asDays() {
		return interval * timeUnit/DAYS;
	}
	
	public double asWeeks() {
		return interval * timeUnit/WEEKS;
	}

	public void asSeconds(double interval) {
		this.interval = interval;
		this.timeUnit = SECONDS;
	}
	
	public void asMinutes(double interval) {
		this.interval = interval;
		this.timeUnit = MINUTES;
	}
	
	public void asHours(double interval) {
		this.interval = interval;
		this.timeUnit = HOURS;
	}
	
	public void asDays(double interval) {
		this.interval = interval;
		this.timeUnit = DAYS;
	}
	
	public void asWeeks(double interval) {
		this.interval = interval;
		this.timeUnit = WEEKS;
	}

	public long getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(long timeUnit) {
		this.timeUnit = timeUnit;
	}
}
