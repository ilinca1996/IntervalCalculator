package com.calculator.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Service;

import com.calculator.model.Interval;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public List<Interval> calculateInterval(List<Interval> intervalList) {

		for (int i = 0; i < intervalList.size(); i++) {

			LocalDateTime start = formatDateTime(intervalList.get(i).getStart());
			LocalDateTime end = formatDateTime(intervalList.get(i).getEnd());
			intervalList.get(i).setDuration(calculateDuration(start, end));
			if (intervalList.get(i).getId() != 0) {
				intervalList.get(i).setIntervalBreak(
						calculateDuration(formatDateTime(intervalList.get(i - 1).getEnd()), start));
			}
		}

		return intervalList;
	}

	private String calculateDuration(LocalDateTime start, LocalDateTime end) {

		Duration duration = Duration.between(start, end);
		String result;
		if (Math.abs(duration.toMinutes()) >= 60)
			result = Math.abs(duration.toMinutes()) / 60 + "h" + Math.abs(duration.toMinutes()) % 60 + "m";
		else
			result = "0h" + duration.toMinutes() + "m";

		return result;
	}

	private LocalDateTime formatDateTime(String dateTime) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		return LocalDateTime.parse(dateTime, formatter);
	}

}
