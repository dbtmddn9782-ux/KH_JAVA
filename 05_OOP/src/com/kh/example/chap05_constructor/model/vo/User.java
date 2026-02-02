package com.kh.example.chap05_constructor.model.vo;

public class User {
	private String userId;
	private String userName;
	private int age;
	private double point;
	
	//생성자를 만들고 하는것이 안전하다
	//기본 생성자
	public User(){
	System.out.println("User this : "+ this);
	}
	//매개변수 있는 생성자
	public User(String userId, String userName, int age, double point) {
//		this.userId = userId;
//		this.userName = userName;
//		this.age = age;
		this(userId, userName, age);
		this.point = point;
	}
	
	// userId, userName
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	// userId, userName, age
	public User(String userId, String userName, int age) {
//		this.userId = userId;
//		this.userName = userName;
		this(userId, userName);
		this.age = age;
	}
	
	
	
	
	
	
	//출력용 메소드
	public void inform() {
		System.out.printf("%s, %s, %d, %f\n", userId, userName, age, point);
	}
	// 오버로딩해서 타입과 갯수가 다른것만 오버로딩 가능
	//  필드 초기화 메소드
	public void inputValue(String userId) {
		this.userId = userId;
		
	}
	public void inputValue2(String userName) {
		this.userName = userName;
	}
	
	public void inputValue(int age) {
		this.age = age;
	}
	
	public void inputValue(double point) {
		this.point = point;
	}
	
	public void inputValue(String userId, String userName, int age, double point) {
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.point = point;
	}
	
	
	

}
