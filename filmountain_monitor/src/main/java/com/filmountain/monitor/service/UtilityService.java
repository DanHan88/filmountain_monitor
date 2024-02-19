package com.filmountain.monitor.service;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

	
	public double roundDouble (double value) {
		return Math.round(value * 100.0) / 100.0;
	}
	public double roundOnce (double value) {
		return Math.round(value * 10.0) / 10.0;
	}
}
