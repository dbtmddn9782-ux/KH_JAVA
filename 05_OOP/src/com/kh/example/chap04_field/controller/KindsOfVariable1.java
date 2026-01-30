package com.kh.example.chap04_field.controller;

public class KindsOfVariable1 {// 클래스 영역
	
	private int globalNum;// 멤버 필드 = 멤버 변수 = 전역 변수 = 필드 : 클래스 영역에 작성한 변수
	
	public void method1(int num) {// 메소드 영역
		//매개변수도 지역변수의 일종
		
		
		int localNum; // 지역변수 : 메소드 영역에 작성한 변수
		
		System.out.println(globalNum);
	}
	
	public void method2() {
		//System.out.println(localNum);
		System.err.println(globalNum);
	}
	

}
