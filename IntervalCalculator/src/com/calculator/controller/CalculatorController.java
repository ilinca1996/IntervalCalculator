package com.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.Interval;
import com.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;
	
	@PostMapping("/intervals")
	public List<Interval> calculateInterval(@RequestBody List<Interval> intervalList) {
		
		return calculatorService.calculateInterval(intervalList);

	}
	
}
