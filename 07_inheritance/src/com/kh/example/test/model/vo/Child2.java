package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	private String str;
	
	public Child2() {
		System.out.println("Child2 : "+this);
	//	super.num = 0; 부모클래스에서 private 즉 같은 클래스까지만 가능
		super.dNum = 1.2;
		super.bool = true;
		super.ch = 'b';
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}

}
