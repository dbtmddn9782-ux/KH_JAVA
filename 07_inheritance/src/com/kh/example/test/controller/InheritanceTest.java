package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("Parent클래스의 num필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : "+p.getNum());
		
		System.out.println("Child1 클래스의 str필드 접근");
		Child1 c = new Child1();
		c.setStr("Hi");
		System.out.println("Child1 안에 있는 str :" + c.getStr() );
		
		System.out.println("Child2 클래스의 str필드 접근");
		Child2 c2 = new Child2();
		c2.setStr("Bye");
		System.out.println("Child1 안에 있는 str :" + c2.getStr() );
		
		System.out.println("Child2클래스가 상속받은 num필드에 접근");
		c2.setNum(99);
		System.out.println("Child2 안에 있는 num : "+c2.getNum());
		
		System.out.println("Parent 안에 있는 num : "+p.getNum());
		
	}

}
