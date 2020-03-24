package com.calculator.service;

import java.util.List;

import com.calculator.model.Interval;

public interface CalculatorService {

	public List<Interval> calculateInterval(List<Interval> intervalList);
	
}
