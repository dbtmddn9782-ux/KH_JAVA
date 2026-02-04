package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		//ㄴ> 부모타입 레퍼런스 ㄴ>부모객체
		p1.printParent();// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		//ㄴ> 자식타입 레퍼런스 ㄴ>자식객체
		c1.printChild1();
		c1.printParent();// c1 레퍼런스로 Child1, Parent에 접근 가능
		
		
		System.out.println();
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2();//다형성 적용(업 캐스팅)
		p2.printParent();
	// 실제 담긴 객체는 Child2객체이지만 레퍼런스 변수 타입에 따라 Parent만 보임
	((Child2)p2).printChild2();//다운 캐스팅
	
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
		//Child2 c2 = new Parent(); 아예 불가능
		//Child2 c2 = (Child2)(new Parent()); 형변환 불가능
		//Child2 c2 = (Child2)p1; 형변환 오류
		
		test(new Parent());
		test(new Child1());
		test(new Child2());
		
		
	}
	
	
	public void test(Parent p) {
		//p 안에 담긴 객체가 Parent면 printParent()호출
		 if (p instanceof Child1) {
			((Child1) p).printChild1();
		} else if (p instanceof Child2) {
			((Child2)p).printChild2();
		} else if(p instanceof Parent) {
			p.printParent();
		}
		 
		 p.print();
	}
	//public void test(Child1 c) {}
	//public void test(Child2 c) {}
	
	
	
	
	
	
	
	
	
	
	
	

}
