package com.calculator.model;

public class Interval {

	private Integer id;
	private String start;
	private String end;
	private String duration;
	private String intervalBreak;
	
	public Interval() {

	}

	public Interval(Integer id, String start, String end, String duration, String intervalBreak) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.duration = duration;
		this.intervalBreak = intervalBreak;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getIntervalBreak() {
		return intervalBreak;
	}

	public void setIntervalBreak(String intervalBreak) {
		this.intervalBreak = intervalBreak;
	}
	
}
