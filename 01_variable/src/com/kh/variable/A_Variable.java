package com.kh.variable;

public class A_Variable {// 기능 클래스
	
	public void declareVariable() {// 메소드 정의
		// 변수 선언 후 초기화
		// 1. 논리형
		boolean isTrue;
		
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 2-2. 실수형
		float fNum;
		double dNum;
		
		// 3.문자형
		// 3-1. 문자
		char ch;
		// 3-2. 문자열
		String str;
		
		isTrue = true;
		bNum = 100;
		sNum = -17;
		iNum = 0;
		lNum = 1234567890;
		fNum = 3.14f;
		dNum = 3.14;
		ch = 'f';
		str = "가나";
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
	}

	public void initVariable() {
		// 변수 선언과 동시에 초기화

		// 1. 논리형
		boolean bl = false;
		// 2. 숫자형
		// 2-1. 정수형
		byte b = 20;
		short s = -20;
		int i = 30;
		long l = 8271789782l;
		// 2-2. 실수형
		float f = 1.99f;
		double d = 2.18;
		// 3.문자형
		// 3-1. 문자
		char c = '응';
		// 3-2. 문자열
		String s1 = "안녕하세요";
		
		System.out.println("bl의 값 : " + bl);
		System.out.println("b의 값 : " + b);
		System.out.println("s의 값 : " + s);
		System.out.println("i의 값 : " + i);
		System.out.println("l의 값 : " + l);
		System.out.println("f의 값 : " + f);
		System.out.println("d의 값 : " + d); 
		System.out.println("c의 값 : " + c);
		System.out.println("s1의 값 : " + s1);
	}
	
	
	
	
	
	
	
	
}
