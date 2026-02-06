package com.kh.example.chap01_Wrapper.controller;

public class WrapperController {
	public void method() {
		int num1 = 10;
		Integer integer1 = new Integer(num1); //기본 자료형을 객체로 변환하는 것 : boxing
		int num2 = integer1.intValue();// 객체를 기본자료형을 변환하는 것 : unBoxing
		
		// jdk 1.5 부터 auto boxing과 auto unBoxing이 된다
		Integer integer2 = num1;// auto boxing
		int num3 = integer2; // auto unBoxing
	}

}
