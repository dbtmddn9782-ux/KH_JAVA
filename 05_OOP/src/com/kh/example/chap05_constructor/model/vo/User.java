package com.kh.example.chap05_constructor.model.vo;

public class User {
	private String userId;
	private String userName;
	private int age;
	private double point;
	
	//출력용 메소드
	public void inform() {
		System.out.printf("%s, %s, %d, %f\n", userId, userName, age, point);
	}
	
	//  필드 초기화 메소드
	public void inputValue(String id) {
		userId = id;
		
	}
	public void inputValue2(String name) {
		userName = name;
	}
	
	public void inputValue3(int nai) {
		age = nai;
	}
	
	public void inputValue4(double p) {
		point = p;
	}
	
	public void inputValue5(String id, String name, int nai, double p) {
		userId = id;
		userName = name;
		age = nai;
		point = p;
	}
	
	
	

}
