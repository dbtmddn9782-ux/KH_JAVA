package com.kh.example.chap03_Date.controller;

import java.util.Date;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.getTime());
		
		Date time = new Date(1770354905132L);
		System.out.println(time);
	}

}
