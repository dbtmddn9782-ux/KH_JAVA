package com.kh.example.chap01_throw.controller;

public class ThrowsController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨...");
	}
	public void method2() {
		System.out.println("method2() 호출됨...");
		try {
			method3();
			System.out.println("나는 출려될까? 안될까?");//출력안됨 위에서 예외가 발생해서 아래 catch로 내려감
		} catch (NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
				e.printStackTrace();
			System.out.println("=======예외 잡음=======");
		}finally {
			System.out.println("예외상관없이 무조건 수행");
		}
		System.out.println("method2() 종료됨...");
	}
	
	public void method3() throws Exception {
		System.out.println("method3() 호출됨...");
		throw new Exception("throws와 try-catch연습을 위해 예외 강제 발생");
		//System.out.println("method3() 종료됨...");
	}

}
