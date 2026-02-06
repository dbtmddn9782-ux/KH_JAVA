package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.getTime());
		
		Date time = new Date(1770354905132L);
		System.out.println(time);
		
		Date date = new Date(2026, 2 ,7);
		System.out.println(date);
	}
	public void method2() {
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int amPm = c.get(Calendar.AM_PM);
//		String strAmPm = amPm == 0?"오전":"오후";
		String strAmPm = amPm == Calendar.AM?"오전":"오후";
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		String strDay = null;
		switch(day) {
		case Calendar.SUNDAY : strDay = "일요일"; break;
		case Calendar.MONDAY : strDay = "월요일"; break;
		case Calendar.TUESDAY : strDay = "화요일"; break;
		case Calendar.WEDNESDAY : strDay = "수요일"; break;
		case Calendar.THURSDAY : strDay = "목요일"; break;
		case Calendar.FRIDAY : strDay = "금요일"; break;
		default: strDay = "토요일"; break;
		
		}
		System.out.printf("%d년 %d월 %d일 %s %s %d시 %d분 %d초", year, month, date, strDay, strAmPm, hour, min, sec);
		
		System.out.println();
		
		GregorianCalendar endGc = new GregorianCalendar(2026, 6, 10, 17, 50, 0); // 26년 
		System.out.println(endGc);
		long milli = endGc.getTimeInMillis();
		Date endDate = new Date(milli);
		System.out.println(endDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 SSS");//HH 대문자로 작성하면 24시시간으로 뜬다.
		String format = sdf.format(endDate);
		System.out.println(format);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
