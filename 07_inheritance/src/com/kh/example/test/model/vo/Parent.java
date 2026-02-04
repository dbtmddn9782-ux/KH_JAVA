package com.kh.example.test.model.vo;

public class Parent {
	private int num; //해당 클래 외 불가능
	double dNum; 	//같은 패키지 내 가능
	protected boolean bool; 
	public char ch;
	
	public Parent() {
		System.out.println("Parent : "+this);
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	

}
