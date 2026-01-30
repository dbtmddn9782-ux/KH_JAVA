package com.kh.practice.func;

import java.util.Scanner;

public class ControlPractice {
	public void method1() {
		
	while(true) {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다");
			break;
		case 2 :
			System.out.println("수정 메뉴입니다");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다");
			break;
		case 7 :	
			System.out.println("프로그램이 종료됩니다");
			return;
		default :
			System.out.println("다시 입력바랍니다");
			break;
		}
		}
	}
	public void method2() {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
