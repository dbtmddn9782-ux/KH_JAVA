package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("Parent클래스의 num필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : "+p.getNum());
		
		System.out.println("Child1 클래스의 str필드 접근");
		Child1 c = new Child1();
		c.setChild1("Hi");
		System.out.println("Child1 안에 있는 str :" + c.getStr() );
		
	}

}
