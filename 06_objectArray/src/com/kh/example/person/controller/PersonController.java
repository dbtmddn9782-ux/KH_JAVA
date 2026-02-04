package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		Person[] pArr = new  Person[5];
		
	//	pArr[0].personInfo() NullPointerException 발생
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
		//각 인덱스 별로 객체 생성 후 대입
		pArr[0] = new Person();
		pArr[1] = new Person("홍길동", 10);
		pArr[2] = new Person("장보고", 29, '남', 178.4, 67.0);
		pArr[3] = new Person("정현종", 26, '남', 160.0, 112.5);
		pArr[4] = new Person("김재훈", 26, '남', 150, 120.5);
		
		for(int i = 0 ; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
		// 초기화가 잘 됐는지 출력
		
		for(int i = 0 ; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
		
		
		//선언과 동시에 초기화
		Person[] pArr2 = {new Person(), new Person("아아아", 24), new Person("카카카", 40, '여', 140.0, 50.2)};
		
		for(int i = 0 ; i < pArr2.length; i++) {
			System.out.println(pArr2[i]);
			System.out.println(pArr2[i].personInfo());
		}
		
		Person song = new Person("송성실", 25, '남', 175.5, 66.6);
		Person yoon = new Person("윤예의", 11, '여', 155.5, 84.5);
		
		Person[] pArr3 = new Person[2];
		pArr[0] = song;
		pArr[1] = yoon;
		
		Person[] pArr4 = {yoon, song};
		
;	}
	

}
